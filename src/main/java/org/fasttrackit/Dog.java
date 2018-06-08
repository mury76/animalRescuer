package org.fasttrackit;

public class Dog extends Animal {

    // Asta este pentru a putea printa obiectul (in clasa obiectului ALT+INS - to string)
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", gender='" + gender + '\'' +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteActivity='" + favoriteActivity + '\'' +
                ", hunger=" + hunger +
                ", mood=" + mood +
                ", health=" + health +
                '}';
    }
}
