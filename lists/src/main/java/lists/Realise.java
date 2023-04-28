package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import lists.LinkedList.LinkedListCore;
import lists.LinkedList.LinkelList;

/**
 * Hello world!
 *
 */
public class Realise
{

    
    public static void main( String[] args )
    {

    LinkedListCore <Integer> ints = new LinkedListCore<>();
        
      
    
    ints.add(12);
    ints.add(99);
    ints.add(22);
    ints.addFirst(9);
    ints.addFirst(23);
    ints.addLast(8);
    
        System.out.println( ints.toString());
        System.out.println(ints.getElemByIndex(3));
       ints.deleteElementByIndex(3);
       ints.changeElemByIndex(0, 12);
        System.out.println( ints.toString());
       
        System.out.println(ints.getElemByIndex(3));
        
}   }