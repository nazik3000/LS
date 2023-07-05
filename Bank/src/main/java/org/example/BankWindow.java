package org.example;


import org.example.Queue.BankQueue;

public class BankWindow implements Runnable {

    BankQueue bankQueue = new BankQueue();
    Customer customer;
    int numberOfWindow;

    BankWindow(BankQueue bankQueue, int numberOfWindow){
        this.bankQueue = bankQueue;
        this.numberOfWindow = numberOfWindow;
    }

    @Override
    public synchronized void run() {
        while (!bankQueue.isEmpty()){

            customer = serveNextCustomer();
            customer.startService();
            try {
                wait(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Customer №"+ customer+ " on service in window № "+ numberOfWindow);
            customer.endService();
        }

    }

    public Customer serveNextCustomer(){


        return bankQueue.dequeue();
    }
}
