package com.example.queue;

import java.util.Objects;



public class StackStr implements Stack {
    int size = 0;
    Node head;
    Node tail;

    public String getMasage(){
        return "List is empty";
    }

    public static class Node {
        String element;
        Node next;
        Node prev;
        

        public Node() {
        }

        /**
         * @param element
         */
        public Node(String element) {
            this.element = element;
            this.next = null;
            this.prev=null;
        }
    }

    // public java.util.Iterator iterator(){
    //     return new StackIterator();
        
    // }

    // private final class StackIterator implements  java.util.Iterator{
    //     private Node temp;
    //     private int index;
    //     @Override
    //     public boolean hasNext() {
    //         if(Objects.isNull(temp)){
    //         throw new UnsupportedOperationException("Unimplemented method 'hasNext'");}
    //         return Objects.nonNull(temp.element);
    //     }

    //     @Override
    //     public Object next() {
    //         if(!hasNext()){
    //         throw new UnsupportedOperationException("Unimplemented method 'next'");
    //     }if(index == 0){
    //         index++;
    //       return  head.element;
    //     }
    //     temp = temp.next;
    //     index++;
    //     return temp.element;

    // }

    public boolean isEmpty(){
        if(size==0){
            return true;
        } else return false;
    }




    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        String S = "{ ";
        Node x = head;
        if (x == null)
            return S + " }";
        while (x.next != null) {

            S += String.valueOf(x.element) + ", ";
            x = x.next;
        }
        S += String.valueOf(x.element);
        return S + " }";
    }

    public  boolean strToChar(String element){
        char[] chars = new char[element.length()];
        chars = element.toCharArray();
        if(chars[0]=='[' || chars[0]=='{' || chars[0]=='(' && 
        chars[element.length()-1]==']' || chars[element.length()-1]=='}' || chars[element.length()-1]==')'){
            return true;
        }else 
        return false;
    }



    @Override
    public void add(String element) {
        Node temp = new Node(element);
        if(strToChar(element)){
        if (size == 0) {
            head = tail = temp;
            size++;
        } else {
            temp.next = head;
            head = temp;
            size++;
        }
    }else System.out.println(element +" - is a wrong String");
    }

    @Override
    public String peek() {
        if(isEmpty()){
            getMasage();
        }
        return head.element;
    }

    @Override
    public String pop() {
        
        Node temp = head;
        String S =  null;
       
        S = head.element;
        head= temp.next;
        return S;
    }

    @Override
    public void remove() {
        head = tail = null;
    }
}
