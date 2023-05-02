package obj_train;

import java.time.LocalDate;

import lombok.ToString;
import obj_train.BirthDate;




public class Human extends AllHumans {
    
    Human(String fname, String lname, String id, LocalDate bDate) {
        super(fname, lname, id, bDate );
        
    }

    public static void main( String[] args ) {
     
        
        Human jake = new Human("Jake", "Hanks","048219",BirthDate.birthDate(2000, 2,12) );
        Human john = new Human("John", "Hanks", "041204", BirthDate.birthDate(2001, 7, 02));
        
        
        System.out.println(john.equals(jake));
        System.out.println(john.lname.equals(jake.lname));  
        jake.sayHello();
        jake.toString();
    }

    

    public static int getAge(LocalDate bDate){
        LocalDate today =LocalDate.now();
        int dayOfBirth =bDate.getYear() - today.getYear();
        return -dayOfBirth;

    }
    
    void sayHello(){
        System.out.println("Hello, "+ "my name is "+fname+", "+ "I'm "+Human.getAge(bDate)+" years old." );
    }
    @Override
    public String toString(){
        return "Name: "+getFname()+
                "\nLast Name: "+getLname()+
                "\nID: "+getId()+
                "\nage: "+Human.getAge(bDate);
        
    }
    
}
