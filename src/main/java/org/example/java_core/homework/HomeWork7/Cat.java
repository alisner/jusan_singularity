package org.example.java_core.homework.HomeWork7;

public class Cat {
    private final String name;
    private boolean isFull;
    private int hungry;

    public Cat(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
        this.isFull = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(hungry)) {
            this.isFull = true;
            System.out.printf("Кот: %s сытый\n", name);
        }
        else {
            this.isFull = false;
            System.out.printf("Кот: %s голоден\n", name);
        }
    }
}
