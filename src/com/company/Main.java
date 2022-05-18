package com.company;

import com.company.classes.Animal;
import com.company.classes.Bird;
import com.company.enums.Error;
import com.company.enums.Level;

public class Main {

    public static void main(String[] args) {

        // ------------------------------
        // OOP Principi
        // 1) Naslijeđivanje - mogućnost klasa da preuzimaju podatke i funkcije drugih klasa (parent/child, super/sub klase)
        Bird bird = new Bird();
        bird.talk();

        // Subklasa ne može biti tipa superklase
        // Bird bird1 = new Animal();

        // Superklasa se može napraviti iz subklase
        Animal animal = new Bird("Ime");
        animal.talk();

        // Korištenje ključne riječi super
        Bird bird2 = new Bird("Žuti");
        bird2.talk();

        // 2) Polimorfizam - sposobnost subklase da ima svoje implementacije metoda iz superklase
        Bird bird3 = new Bird("Žuti"); // 2
        // bird3.name = "Žuti"; // 1
        bird3.setName("Žuti"); // 3

        // 1) Runtime Polimorfizam -> nakon pokretanja programa
        bird3.talk();

        // 2) Compile-time Polimorfizam -> prije pokretanja programa
        Animal animal1 = new Animal();
        animal1.jump();
        animal1.jump(2);

        // 3) Enkapsulacija - princip koji skriva podatke jedne klase i omogućava njihovu izmjenu samo kroz metode
        // Getteri i Setteri
        Animal animal4 = new Animal();
        animal4.setName("Delfin");
        System.out.println(animal4.getName());
        System.out.println(animal4.nameToUppercase());

        // 4) Apstrakcija - postavlja primjer izgleda klase ali je ne implementira - ne implementira njene funkcije već samo daje uslov da one postoje
        // Primjena apstrakcije:
            // 1) Apstraktne klase -> ne moraju pratiti princip apstrakcije 100%
            // 2) Interfejsi -> 100% apstraktni

        // ------------------------------
        // Implementacije OOP principa
        // 5) Interfejsi

        // 6) Enumi - entitet u Javi koji ima mogućnost da "lista" stvari
        Level level = Level.NORMAL; // User input
        switch (level){
            case EASY -> {return;}
            case NORMAL -> {return;}
            case HARD -> {return;}
        }

        for (Level l : Level.values()){
            System.out.println("Currently at level " + l);
        }

        System.out.println(Error.INTERNAL_SERVER_ERROR.toString());
        System.out.println(Error.INTERNAL_SERVER_ERROR.getCode());

    }

}
