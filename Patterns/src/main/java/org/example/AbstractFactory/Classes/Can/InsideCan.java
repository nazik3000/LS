package org.example.AbstractFactory.Classes.Can;

import org.example.AbstractFactory.Interfaces.InCan;
import org.example.AbstractFactory.Interfaces.MakeDrink;

public class InsideCan implements InCan {
    @Override
    public void drinkInCan(MakeDrink makeDrink) {
        System.out.print("Drink in can are: ");
        makeDrink.releaseDrink();
    }
}
