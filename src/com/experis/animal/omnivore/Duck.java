package com.experis.animal.omnivore;

import com.experis.animal.Abilities;
import com.experis.animal.Flyable;
import com.experis.animal.Swimmable;
import com.experis.animal.Walkable;

public class Duck extends Omnivore implements Swimmable, Walkable, Runnable, Flyable {
    public Duck(Abilities... abilities) {
        super(abilities);
        name = "Duck";
        age = 10;
    }

    public void swim() {
        action("swimming");
    }

    public void walk() {
        action("walking");
    }

    public void run() {
        action("running");
    }

    public void fly() {
        action("flying");
    }

    @Override
    public void displayRandomAbility(Abilities ability)  {
        switch(ability) {
            case SWIMMABLE:
                swim();
                break;
            case WALKABLE:
                walk();
                break;
            case RUNNABLE:
                run();
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
