package org.example.Queue;

import org.example.Customer;

public interface BankQueueCore {
    void enqueue(Customer customer);
    Customer dequeue();


    boolean isEmpty();
}
