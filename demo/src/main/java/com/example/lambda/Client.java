package com.example.lambda;

public class Client implements Comparable<Client> {
    private String name;
    private int age;
    private int salary;
    private boolean inActive;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean isInActive() {
        return inActive;
    }
    public void setInActive(boolean inActive) {
        this.inActive = inActive;
    }
    public Client(String name, int age, int salary, boolean inActive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.inActive = inActive;
    }
    @Override
    public int compareTo(Client client) {
        return age - client.age;
    }
    @Override
    public String toString() {
        return "Client [name=" + name + ", age=" + age + ", salary=" + salary + ", inActive=" + inActive + "]";
    }
    
    
}
