package lists.LinkedList;

import java.util.List;
import java.util.Objects;

import javax.lang.model.element.Element;
import javax.xml.transform.Templates;

public class LinkedListCore<T> implements LinkelList<T>{

   
    private int size;
    private Node<T> first;
    private Node<T> last;

    public static class Node<T>{
        Node<T> next;
        Node<T> previous;
        T element;

        /*
        Standart construcror 
        */
        Node(){
            
        }
        /*
         Usefull constructor 
         */
        Node(T element){
           this.element =element;
           this.next =null;
           this.previous= null;

        }
    
    }
    /*
    Adding element to the end of list 
    */
    @Override
    public void add(T element) {      
       if(this.first==null){
        addFirst(element);
       }else{
       addLast(element);
       }
    }
    
    /*
    Adding element in head of list 
    */
    public void addFirst(T element){
       Node<T> temp = new Node<>(element);
       temp.next = first;
       first = temp; 
       if(size == 0){
        last = temp;
       }
       size++;
    }

    /*
    Adding element to the end of list 
    */
    public void addLast(T element){
        Node<T> temp = new Node<>(element);
        
        if(size == 0){
        first = last = temp;
        }else{
            last.next = temp;
            last = temp;
        }
        size++;
    }

    
    
    public int getSize(){
        return size;
    }
    

    
    /*
    Change element by new 
    */
    @Override
    public void changeElemByIndex(int index, T element) {
        if(size==0){
            System.out.println("List is empty");
        }else if(index<0 || index>=size){
            System.out.println("Invalid index value");
        }else{
            Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            temp.element = element;
        }

    }
    /*
    Printing list 
     */
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
    public T getElemByIndex(int index) {
        Node<T> t = first;
        if(size==0){
        System.out.println("List is empty");
        
        }else if(index<0 || index>=size){
            System.out.println("Invalid value");
        }else{
            Node<T> temp = first;
            for (int i = 0; i < index; i++) {
                temp= temp.next;
            }
            t=temp;
            
        }
        return t.element;
           
    }

    /*
     * Removing element from list
     */
    @Override
    public void deleteElementByIndex(int index) {
        
        if(size==0){
            System.out.println("List is empty");
        }else if(index<0 || index>=size){
            System.out.println("Out of index range");
        }else{
            Node<T> temp = first;
            for (int i = 0; i < index-1; i++) {  
                temp = temp.next;
            }
            temp.previous=temp;

            temp.next = temp.next.next;
           
      
        }

        
    }
    
}
