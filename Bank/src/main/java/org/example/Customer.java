package org.example;

public class Customer {
    private final int id;
    public int getId(){
        return id;
    }
    Customer(int id){
        this.id=id;
    }


    public void startService(){
        System.out.println("Начало обслуживания");
    }
    public void endService(){

        System.out.println("Конец обслуживания");
    }


    @Override
    public String toString() {
        return
                "id=" + id
                ;
    }
}
