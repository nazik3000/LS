package com.example;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.lambda.Client;

public class MyStream {
    public static void main(String[] args) {
        
        List<Client> clients = new List<Client>();

        Client client1 = new Client("John", 35, 12, false);
        Client client2 = new Client("Tom", 45, 15, true);
        Client client3 = new Client("Nick", 30, 9, true);
        Client client4 = new Client("Bill;", 33, 6, false);
        clients.add(client4);
        clients.add(client3);
        clients.add(client2);
        clients.add(client1);

       
                
                
          List<Client> cList = clients.stream()
                        .filter(c-> c.isInActive())
                        .peek(c->  c.setSalary(c.getSalary()+2))
                        .toArray();
    }
}
