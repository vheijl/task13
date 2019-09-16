package com.experis.animal.carnivore;

import com.experis.animal.Abilities;
import com.experis.animal.Climbable;
import com.experis.animal.Walkable;

public class Cat extends Carnivore implements Walkable, Runnable, Climbable {
    public Cat(Abilities... abilities) {
        super(abilities);
        name = "Cat";
        age = 10;
    }

    public void walk() {
        action("walking");
    }

    public void run() {
        action("running");
    }

    public void climb() {
        action("climbing");
    }

    @Override
    public void displayRandomAbility(Abilities ability)  {
        switch(ability) {
            case WALKABLE:
                walk();
                break;
            case RUNNABLE:
                run();
                break;
            case CLIMBABLE:
                climb();
                break;
            default:
                System.out.println("That is no ability!");
                break;
        }
    }

}
