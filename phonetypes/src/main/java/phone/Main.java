package phone;

import phone.NonCablePhone.NonCablePhoneBuilder;
import phone.NonCablePhoneLombok;
import phone.NonCablePhone;
import phone.Os;
/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        SensorPhone sensorPhone = new SensorPhone();
        sensorPhone.builder().brand("");
        sensorPhone.toString();

        ButtonPhone bp = new ButtonPhone();
        bp.builder().brand("motorolla").model("C33");
        bp.toString();
      
    //    SensorPhone iphone = new SensorPhone("IPhone", "11");
    //    ButtonPhone motorolla = new ButtonPhone("Motorolla", "X9");
            NonCablePhone iPhone = NonCablePhone.builder()
                                            .bateryCapacity(1000)
                                            .brand("IPhone")
                                            .model("12")
                                            .os(Os.OS)
                                            .memory(256)
                                            .mainMemory(2)
                                            .processor("12TI")
                                            .build();

            NonCablePhone samsung =  NonCablePhone.builder()
                                        .brand("SAMSUNG")
                                        .mainMemory(1)
                                        .memory(64)
                                        .model("GH200")
                                        .bateryCapacity(800)
                                        .build();

        iPhone.acceptCall();
        iPhone.answerMachine();
        iPhone.deniCall();
        iPhone.makeCall();
        System.out.println(samsung.toString());
        System.out.println( iPhone.workTimeWithoutcharging(1000, 200));
                                       
    }
}
