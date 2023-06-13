package org.example.AbstractFactory.Classes;

import org.example.AbstractFactory.Interfaces.MakeDrink;

public class ColaDrink implements MakeDrink {

    @Override
    public void releaseDrink() {
        System.out.println("Making Coca-cola");
    }
}
