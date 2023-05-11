package com.example.lambda;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
//import java.com.example.List;



public class TryingLambda {
    public static void main(String[] args) {

        List<Client> clients = new ArrayList<>();
    
       Client client1 = new Client("John", 35, 12, false);
       Client client2 = new Client("Tom", 45, 15, true);
       Client client3 = new Client("Nick", 30, 9, true);
       Client client4 = new Client("Bill;", 33, 6, false);

       clients.add(client4);
       clients.add(client3);
       clients.add(client2);
       clients.add(client1);

       List<Client> clients2 = clients.stream()
                        .filter(c->c.isInActive())
                        .map(client -> new Client(client.getName(), client.getAge(), client.getSalary()+2, client.isInActive()))
                        .collect(Collectors.toList());
                        
    
        

       
        for (int i = 0; i < clients2.size(); i++) {
            System.out.println(clients2.get(i));
        }
      
        
           
        
}
}