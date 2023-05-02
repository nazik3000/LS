package phone;

public  class CablePhone implements PhonesAbilities {

    @Override
    public void makeCall() {
       System.out.println("making   call");
    }

    @Override
    public void deniCall() {
        System.out.println("Deni call");
    }

    @Override
    public void answerMachine() {
        System.out.println("buuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuup");
    }

    @Override
    public void acceptCall() {
        System.out.println("Listen");
    }
    

}
