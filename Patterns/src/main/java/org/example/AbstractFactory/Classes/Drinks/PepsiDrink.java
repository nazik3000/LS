package org.example.AbstractFactory.Classes;

import org.example.AbstractFactory.Interfaces.MakeDrink;

public class PepsiDrink implements MakeDrink {
    @Override
    public void releaseDrink() {
        System.out.println("Making Pepsi cola");
    }
}
