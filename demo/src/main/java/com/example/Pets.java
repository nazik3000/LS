package com.example;

public class Pets implements Comparable<Pets> {
    private int age;
    private String name;
    @Override
    public int compareTo(Pets pets) {
        return age -pets.age ;
    }
    @Override
    public String toString() {
        return "Pets [age=" + age + ", name=" + name + "]";
    }
    public Pets(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Pets(){
        
    }
    
}
