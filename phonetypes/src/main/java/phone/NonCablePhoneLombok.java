package phone;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder
@Data
public class NonCablePhoneLombok {
    
    @NonNull private String brand;
    @NonNull   private String model;
    private String processor;
    private int memory;
    private int mainMemory;
    @NonNull private Os os;
    private int batteryCapacity;

}
