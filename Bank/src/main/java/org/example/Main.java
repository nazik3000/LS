package org.example;

import org.example.Queue.BankQueue;

public class Main {
    public static void main(String[] args) {
        BankQueue bankQueue = new BankQueue();

        Customer customer1 = new Customer(1);
        Customer customer2 = new Customer(2);
        Customer customer3 = new Customer(3);
        Customer customer4 = new Customer(4);
        Customer customer5 = new Customer(5);
        Customer customer6 = new Customer(6);
        Customer customer7 = new Customer(7);


        bankQueue.enqueue(customer1);
        bankQueue.enqueue(customer2);
        bankQueue.enqueue(customer3);
        bankQueue.enqueue(customer4);
        bankQueue.enqueue(customer5);
        bankQueue.enqueue(customer6);
        bankQueue.enqueue(customer7);


        // Futures/Executors
        BankWindow bankWindow1 = new BankWindow(bankQueue,1);
        BankWindow bankWindow2 = new BankWindow(bankQueue,2);
        BankWindow bankWindow3 = new BankWindow(bankQueue,3);
        Thread firstBankThread = new Thread(bankWindow1);
        Thread secondBankThread = new Thread(bankWindow2);
        Thread thirdBankThread = new Thread(bankWindow3);
        firstBankThread.start();
        secondBankThread.start();
        thirdBankThread.start();

    }
}