package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

       List<Integer> nums = new List<>();
       nums.add(1);
       nums.add(13);
       nums.add(22);
       //System.out.println(nums.getElementByIndex(2));
       System.out.println(nums.toString()); 
       nums.addElemByIndex(0, 99);
       //nums.deleteByIndex(2);
       nums.addElemByIndex(1, 5);
       System.out.println(nums.toString()); 

       System.out.println("---------------------------");

       Pets dog = new Pets(2, "Kirill");
       Pets cat = new Pets(3, "Nazar");
       Pets frog = new Pets(1, "Jonny");
       List<Pets> homePets = new List<>();    
       
       homePets.add(dog);
       homePets.add(frog);
       homePets.add(cat);
       
       homePets.sort(true);
        System.out.println(homePets.toString());
    }
}