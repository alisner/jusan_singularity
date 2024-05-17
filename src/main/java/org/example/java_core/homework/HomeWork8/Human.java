package org.example.java_core.homework.HomeWork8;

public class Human implements Movable {
    private final String name;
    private final double maxRunMeter;
    private final double maxJumpHeightMeter;

    public Human(String name, double maxRunMeter, double maxJumpHeightMeter) {
        this.name = name;
        this.maxRunMeter = maxRunMeter;
        this.maxJumpHeightMeter = maxJumpHeightMeter;
    }

    @Override
    public boolean run(double length) {
        if (maxRunMeter >= length) {
            System.out.printf("Человек: %s успешно пробежал %.2f метров\n", name, length);
            return true;
        }
        else {
            System.out.printf("Человек: %s не смог пробежать %.2f метров\n", name, length);
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (maxJumpHeightMeter >= height) {
            System.out.printf("Человек: %s успешно прыгнул на %.2f метров\n", name, height);
            return true;
        }
        else {
            System.out.printf("Человек: %s не смог прыгнуть на %.2f метров\n", name, height);
            return false;
        }
    }

}
