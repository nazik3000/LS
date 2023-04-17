package phone;

import java.time.Instant;



public  class NonCablePhone implements PhonesAbilities {

    private String brand;
    private String model;
    private String processor;
    private int memory;
    private int mainMemory;
    private Os os;
    private int batteryCapacity;

    @Override
    public String toString() {
        
        return "Phone is: " + brand + " " + model
                + "\nIt has " + processor + " processor" +
                ", " + memory + " gb memory"+ " and "+
                mainMemory + " gb main memory.\n " +
                "Work at " + os +" operation system."
                + "It has "+ batteryCapacity + " amp battery capacity";
    }


    NonCablePhone(){

    }
    public static NonCablePhoneBuilder builder(){
        return new NonCablePhoneBuilder();
    }

    public static final class NonCablePhoneBuilder{
        NonCablePhone nonCablePhone;
        

        public NonCablePhoneBuilder(){
            this.nonCablePhone =new NonCablePhone();
            
        }

        public NonCablePhoneBuilder brand(String brand){
            nonCablePhone.brand=brand;
            return this;
        }
        public NonCablePhoneBuilder model(String model){
            nonCablePhone.model=model;
            return this;
        }
        public NonCablePhoneBuilder processor(String processor){
            nonCablePhone.processor=processor;
            return this;
        }
        public NonCablePhoneBuilder memory(int memory){
            nonCablePhone.memory=memory;
            return this;
        }
        public NonCablePhoneBuilder mainMemory(int mainMemory){
            nonCablePhone.mainMemory=mainMemory;
            return this;
        }
        public NonCablePhoneBuilder os(Os os){
            nonCablePhone.os=os;
            return this;
        }
        public NonCablePhoneBuilder bateryCapacity(int batteryCapacity){
            nonCablePhone.batteryCapacity=batteryCapacity;
            return this;
        }

        public NonCablePhone build(){
            return nonCablePhone;
        }


    }
    
    int workTimeWithoutcharging(int batteryCapacity,int usableBatarry){
        int tineWithoutCharging = batteryCapacity / usableBatarry ;
        
        return tineWithoutCharging;
    }

    @Override
    public void makeCall() {
        System.out.println("Buuuuuuuuuuuuuuuuup");
        
    }

    @Override
    public void acceptCall() {
        System.out.println("Accepting call");
        
    }

    @Override
    public void deniCall() {
        System.out.println("Byp-Byp-Byp-Byp");
        
    }

    @Override
    public void answerMachine() {
        System.out.println("Sorry, user are offline, please tell your masage after sound signal, beeeeeeeep");
       
    }
    
}
