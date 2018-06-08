package org.fasttrackit;

import java.util.Scanner;

public class Game {

    public static final int DRY_FOOD_VALUE = 20;
    public static final int WET_FOOD_VALUE = 30;
    public static final int FAVORITE_FOOD_VALUE = 50;

    public void start() {

        // Creating "rescuer" obj.
        System.out.println("Enter your name: ");
        Scanner resNameScanner = new Scanner(System.in);
        String resName = resNameScanner.nextLine();

        Rescuer rescuer = new Rescuer();
                rescuer.setName(resName);


        // Creating dog food objects
        Food dogDryFood = new Food();
        dogDryFood.setName("Dry food");
        dogDryFood.setNutritionValue(DRY_FOOD_VALUE);

        Food dogWetFood = new Food();
        dogWetFood.setName("Wet food");
        dogWetFood.setNutritionValue(WET_FOOD_VALUE);

        Food dogFavoriteFood = new Food();
        dogFavoriteFood.setName("Bone");
        dogFavoriteFood.setNutritionValue(FAVORITE_FOOD_VALUE);


        // Creating "dog" obj.
        System.out.println("Enter a name for your dog: ");
        Scanner dogNameScanner = new Scanner(System.in);
        String dogName = dogNameScanner.nextLine();

        System.out.println("Enter the age of your dog: ");
        Scanner ageScanner = new Scanner(System.in);
        String age = ageScanner.nextLine();

        Dog dog = new Dog();
            dog.setName(dogName);
            dog.setColor("white");
            dog.setAge(age);
            dog.setWeight("19Kg");
            dog.setGender("Male");
            dog.setFavoriteFood(dogFavoriteFood.getName());



        System.out.println(dog);
        System.out.println(rescuer);


    }
}
