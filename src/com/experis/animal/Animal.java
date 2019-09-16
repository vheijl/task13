package com.experis.animal;

import java.util.Random;

public abstract class Animal {
    protected String name;
    protected int age;
    protected Abilities[] abilities;

    public Animal(Abilities... abilities) {
        this.abilities = abilities;
    }

    public void listAbilities() {
       System.out.println("The " + name + " has the following abilities: " + buildCommaSeparatedList(abilities));
    }

    public Abilities getRandomAbility() {
        Random rand = new Random();
        int r = rand.nextInt(abilities.length);
        return abilities[r];
    }

    public void displayRandomAbility(Abilities ability)  {
        // Overridden in child classes.
    }

    public void action(String action) {
        System.out.println("The " + name + " is " + action + ".");
    }

    private String buildCommaSeparatedList(Abilities[] abs) {
        String result = "";
        String delimiter;
        for (int i = 0; i < abs.length; i++) {
            if (i == abs.length - 2) {
                delimiter = " and ";
            } else if (i == abs.length - 1) {
                delimiter = ".";
            } else{
                delimiter = ", ";
            }
            result += abs[i].toString().toLowerCase() + delimiter;
        }
        return result;
    }
}
