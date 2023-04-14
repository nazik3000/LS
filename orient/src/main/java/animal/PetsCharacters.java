package animal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PetsCharacters {
    
    String genus;
    PetsAction type;
    String petName;
    int petAge;
    double weight;
    int population;
    String locality;
}
