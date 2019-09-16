package com.experis.animal.omnivore;

import com.experis.animal.Abilities;
import com.experis.animal.Flyable;
import com.experis.animal.Walkable;

public class Crow extends Omnivore implements Flyable, Walkable {

    public Crow(Abilities... abilities) {
        super(abilities);
        this.name = "Crow";
        this.age = 6;
    }

    public void fly() {
        action("flying");
    }

    public void walk() {
        action("walking");
    }

    @Override
    public void displayRandomAbility(Abilities ability)  {
        switch(ability) {
            case WALKABLE:
                walk();
                break;
            case FLYABLE:
                fly();
                break;
            default:
                System.out.println("That is no ability!");
                break;
        }
    }
}