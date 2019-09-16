package com.experis;

import com.experis.animal.*;
import com.experis.animal.carnivore.*;
import com.experis.animal.herbivore.*;
import com.experis.animal.omnivore.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    	System.out.println("+------------------------+ \nTask 13 by Victor Heijler\n+------------------------+");
        ArrayList<Animal> animals = new ArrayList<Animal>();

		Animal cat  = new Cat(Abilities.WALKABLE, Abilities.RUNNABLE, Abilities.CLIMBABLE);
	    Animal crow = new Crow(Abilities.FLYABLE, Abilities.WALKABLE);
	    Animal crab = new Crab(Abilities.SWIMMABLE, Abilities.WALKABLE);
	    Animal duck = new Duck(Abilities.SWIMMABLE, Abilities.WALKABLE, Abilities.FLYABLE, Abilities.RUNNABLE);

	    animals.add(cat);
	    animals.add(crow);
	    animals.add(crab);
	    animals.add(duck);

		for (int i = 0; i < animals.size(); i++) {
			Animal animal = animals.get(i);
			animal.listAbilities();
			animal.displayRandomAbility(animal.getRandomAbility());
		}
    }
}
