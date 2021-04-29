package com.example.demoexplicitintent;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    int strength;
    int technicalProwess;

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        this.strength = strength;
        this.technicalProwess = technicalProwess;
    }

}
