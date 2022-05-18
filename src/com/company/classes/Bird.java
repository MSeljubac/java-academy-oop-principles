package com.company.classes;

import com.company.classes.Animal;

// Subklasa
public class Bird extends Animal {

    private Integer age;

    public Bird(){}

    // All Args (svi agrumenti) konstruktor
    public Bird(String name) {
        super.setName(name);
        this.age = 2;
    }

    @Override
    public void talk() {
        System.out.println("Animal \"talks\"!");
    }

}
