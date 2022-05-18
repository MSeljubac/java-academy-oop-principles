package com.company.classes;

import java.util.Locale;

// Superklasa
public class Animal {

    // Podaci
    private String name;

    // Getter
    public String getName(){
        return this.name;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }

    public String nameToUppercase(){
        return this.name.toUpperCase();
    }

    // Akcije - funkcije i metode
    public void talk() {
        System.out.println("Animal \"talks\"!");
    }

    public void jump() {
        System.out.println("Animal jumps!");
    }

    public void jump(int meters) {
        System.out.println("Animal jumps " + meters + " meters high!");
    }
}
