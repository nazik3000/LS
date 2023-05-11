package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class List<T extends Comparable<T>> implements ListCore<T>{

    private int size;
    private Node<T> first;
    private Node<T> last;
    /*
     * Lists node
     */
    public static class Node<T>{
        Node<T> next;
        Node<T> previous;
        T element;
        public Node(T element) {
            this.next = null;
            this.previous = null;
            this.element = element;
        }
        public Node() {
        } 
    }
    /* 
     * Iterator block
    */
    @Override
    public Iterator<T> iterator() {
       return new ListIterator();
    }
    private final class ListIterator implements Iterator<T>{
        private Node<T> temp;
        private int index;

        @Override
        public boolean hasNext() {
            if(Objects.isNull(temp)){
                throw new NoSuchElementException("List is Empty");
            }
            return Objects.nonNull(temp.next);
        }

        @Override
        public T next() {
            if(!hasNext()){
            throw new UnsupportedOperationException("Unimplemented method 'next'");
            }
            if(index==0){
                index++;
               return first.element;
            }
            temp = temp.next;
            index++;
            return temp.element;
        }

        public ListIterator() {
            this.temp = first;
            index = 0;
        }
    }
    /*
     * Comparator Block
     */
    public Comparator<T> comparator(){
        return new ListComparator();
        
    }
    public Comparator<T> reverseComparator(){
        return new ReverseListComparator();
        
    }
    private final class ListComparator implements Comparator<T>{

        @Override
        public int compare(T o1, T o2) {
            return o1.compareTo(o2);
        }
        
    }
    private final class ReverseListComparator implements Comparator<T>{

        @Override
        public int compare(T o1, T o2) {
            return o2.compareTo(o1);
        }
        
    }
    
    @Override
    public String toString(){
        String S="{ ";
        Node<T> x =first;
        if(x==null)
        return  S+" }";
        while(x.next != null){
         
            S+=String.valueOf(x.element)+ ", ";
            x=x.next;
        }
        S+= String.valueOf(x.element);
        return S+" }";
    }
    
    @Override
    public void add(T element) {
       if(size==0){
        addFirst(element);
       }else{
        addLast(element);
       }
    }    
    public void addFirst(T element){
        Node<T> temp = new Node<>(element);
        if(size==0){
            first = last = temp;
            size++;
        }else{
            first = first.next;
            first = temp;
            size++;
        }

    }    
    public void addLast(T element){
        Node<T> temp = new Node<T>(element);
        if(size==0){
            first = last = temp;
            size++;
        }else{
            last.next=temp;
            last = last.next;
            size++;
        }
    }
    
    @Override
    public void deleteByIndex(int index) {
        if(size ==0){
            System.out.println("List Empty");
        }else if(index<0 || index>=size){
            System.out.println("Invalid Value");
        
        }else {
            Node<T> temp =first;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.previous = temp;
            temp.next = temp.next.next;
        }
    }
    
    @Override
    public void changeByIndex(int index, T element) {
        if(size ==0){
            System.out.println("List Empty");
        }else if(index<0 || index>=size){
            System.out.println("Invalid Value");
        }else{  
            Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp=temp.next;
            }
            temp.element = element;

        }
    }
    
    @Override
    public T getElementByIndex(int index) {
        Node<T> t =first;
        if(size==0){
          System.out.println("List is empty");
        }
        else if(index<0 || index>=size){
            System.out.println("Invalid value");
        }else{
                Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            t= temp;
        
        }
        
        return t.element ;
        
    }

    private Node<T> getElem(int index){
        Node<T> temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
        
    }
    @Override
    public void addElemByIndex(int index, T element) {
        
        if(size == 0){
           System.out.println("Empty list");
        }else if(index<0||index>=size){
            System.out.println("Invalid value");
        }else{
            Node<T> newNode = new Node<>(element);
            Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.previous = temp;
            temp.next = newNode;
            

        }
    }

    private boolean isEmptyList(){
        return Objects.isNull(first);
        
    }
    private boolean set(int index, T newValue){
        if(index<0|| index>size|| isEmptyList() ){
        return false;
        }
        Node<T> temp = getElem(index);
        temp.element = newValue;
        return true;
        
        
    }
    public Object[] toArray(){
        Object[] result = new Object[size];
        Node<T> temp = first;
        int i=0;
        while(Objects.nonNull(temp)){
            result[i] = temp.element;
            temp = temp.next;
            i++;
        }
        return result;
    }
    public void sort(boolean order){
        Object[] array = toArray();
        if(order){
            Arrays.sort(array);
        } else{
            Arrays.sort(array, (Comparator)comparator());
        }
        for (int i = 0; i < array.length; i++) {
            set(i, (T) array[i]);
        }
    }
    @Override
    public Stream<T> stream() {
        Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize(iterator(), Spliterator.SIZED);
        return StreamSupport.stream(spliterator, true);
    }
    
   
}
