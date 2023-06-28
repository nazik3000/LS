package org.example.Queue;

import org.example.Customer;

import java.util.LinkedList;

public class BankQueue implements BankQueueCore{

    LinkedList<Customer> bankQueueList = new LinkedList<>();
    @Override
    public void enqueue(Customer customer) {
        bankQueueList.add(customer);
    }

    @Override
    public Customer dequeue() {
       return bankQueueList.pop();
    }

    @Override
    public boolean isEmpty() {
        return bankQueueList.isEmpty();
    }

    @Override
    public String toString(){
        return null;
    }
}
