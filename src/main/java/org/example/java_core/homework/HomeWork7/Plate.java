package org.example.java_core.homework.HomeWork7;

public class Plate {

    private int maxSize;

    private int food;

    public Plate(int maxSize) {
        this.food = maxSize;
        this.maxSize = maxSize;
    }

    public boolean decreaseFood(int quantity) {
        if ((food - quantity) < 0) {
            System.out.printf("Plate: %d / %d\n", maxSize, food);
            return false;
        }
        food -= quantity;
        System.out.printf("Plate: %d / %d\n", maxSize, food);
        return true;
    }

    public boolean addFood(int quantity) {
        if (quantity < 0) {
            System.out.printf("Plate: %d / %d\n", maxSize, food);
            return false;
        }
        if ((food + quantity) > maxSize)
            food = maxSize;
        else
            food += quantity;
        System.out.printf("Plate: %d / %d\n", maxSize, food);
        return true;
    }

}
