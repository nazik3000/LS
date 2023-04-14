package obj_train;

import java.time.LocalDate;

public class BirthDate {
    
   public static LocalDate birthDate(int y,int m,int d){
    LocalDate birthLocalDate = LocalDate.of(y, m, d);
    return birthLocalDate;

   }
   
}
