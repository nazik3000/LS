package org.example.AbstractFactory.Classes;

import org.example.AbstractFactory.Interfaces.MakeDrink;

public class SpriteDrink implements MakeDrink {
    @Override
    public void releaseDrink() {
        System.out.println("Making Sprite");
    }
}
