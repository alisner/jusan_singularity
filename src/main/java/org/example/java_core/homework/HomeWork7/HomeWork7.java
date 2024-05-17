package org.example.java_core.homework.HomeWork7;

public class HomeWork7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("cat1", 10),
                new Cat("cat2", 15),
                new Cat("cat3", 20),
                new Cat("cat4", 20),
                new Cat("cat5", 20),
                new Cat("cat6", 20)
        };
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.addFood(500);
    }
}
