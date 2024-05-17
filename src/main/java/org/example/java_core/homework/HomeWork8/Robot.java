package org.example.java_core.homework.HomeWork8;

public class Robot implements Movable {
    private final String name;
    private final double maxRunMeter;
    private final double maxJumpHeightMeter;

    public Robot(String name, double maxRunMeter, double maxJumpHeightMeter) {
        this.name = name;
        this.maxRunMeter = maxRunMeter;
        this.maxJumpHeightMeter = maxJumpHeightMeter;
    }

    @Override
    public boolean run(double length) {
        if (maxRunMeter >= length) {
            System.out.printf("Робот: %s успешно пробежал %.2f метров\n", name, length);
            return true;
        }
        else {
            System.out.printf("Робот: %s не смог пробежать %.2f метров\n", name, length);
            return false;
        }
    }

    @Override
    public boolean jump(double height) {
        if (maxJumpHeightMeter >= height) {
            System.out.printf("Робот: %s успешно прыгнул на %.2f метров\n", name, height);
            return true;
        }
        else {
            System.out.printf("Робот: %s не смог прыгнуть на %.2f метров\n", name, height);
            return false;
        }
    }
}
