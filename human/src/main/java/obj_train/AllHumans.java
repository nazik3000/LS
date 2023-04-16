package obj_train;

import java.time.LocalDate;


import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class AllHumans {
    
    
    String fname;
     String lname;
    String id;
     LocalDate bDate;
  
    

}
