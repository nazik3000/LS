package org.example.Queue;

import org.example.Customer;

public class BankQueue implements BankQueueCore{
    private  int size = 0;

    private Node head;
    private Node tail;

    private static class Node<Customer>{
        Node next;
        Customer customer;

        Node(){

        }
        Node(Customer customer){
            this.customer = customer;
            this.next = null;
        }


    }

    @Override
    public void enqueue(Customer customer) {
        Node temp = new Node<>(customer);
        if(size==0){
            head=tail = temp;
        }
    }

    @Override
    public void dequeue() {

    }
}
