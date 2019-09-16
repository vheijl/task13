package com.experis.animal.herbivore;

import com.experis.animal.Abilities;
import com.experis.animal.Swimmable;
import com.experis.animal.Walkable;

public class Crab extends Herbivore implements Swimmable, Walkable {
    public Crab(Abilities... abilities) {
        super(abilities);
        this.name = "Crab";
        this.age = 4;
    }

    public void swim() {
        action("swimming");
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
            case SWIMMABLE:
                swim();
                break;
            default:
                System.out.println("That is no ability!");
                break;
        }
    }
}
