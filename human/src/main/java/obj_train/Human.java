package obj_train;

import java.time.LocalDate;
import obj_train.BirthDate;




public class Human extends AllHumans {
    
    Human(String fname, String lname, String id, LocalDate bDate) {
        super(fname, lname, id, bDate);
        
    }

    public static void main( String[] args ) {
        LocalDate bDate = BirthDate.birthDate(1900, 2, 12);
        
        Human tom = new Human("Tom", "Hanks", "21231",bDate);
        System.out.println(tom);
        Human jake = new Human("Jake", "Boxes","048219",BirthDate.birthDate(2000, 2,12));
        System.out.println(jake);
        System.out.println(getAge(jake.bDate));
        System.out.println(getAge(tom.bDate));   
         
    }

    

    public static int getAge(LocalDate bDate){
        LocalDate today =LocalDate.now();
        int dayOfBirth =bDate.getYear() - today.getYear();
        return -dayOfBirth;

    }
    
}
