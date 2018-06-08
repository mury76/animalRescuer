package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public void start() {
        // Creating "rescuer" obj.
        System.out.println("Enter your name: ");
        Scanner resNameScanner = new Scanner(System.in);
        String resName = resNameScanner.nextLine();

        Rescuer rescuer = new Rescuer();
                rescuer.setName(resName);


        // Creating "dog" obj.
        System.out.println("Enter a name for your dog: ");
        Scanner dogNameScanner = new Scanner(System.in);
        String dogName = dogNameScanner.nextLine();

        System.out.println("Enter the age for your dog: ");
        Scanner ageScanner = new Scanner(System.in);
        String age = ageScanner.nextLine();

        Dog dog = new Dog();
            dog.setName(dogName);
            dog.setColor("white");
            dog.setAge(age);

        System.out.println(dog);
        System.out.println(rescuer);


    }
}
