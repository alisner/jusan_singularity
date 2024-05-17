package org.example.java_core.homework.HomeWork8;

public class Treadmill implements Obstacle {
    private final double length;

    public Treadmill(double length) {
        this.length = length;
    }

    @Override
    public boolean pass(Movable player) {
        return player.run(length);
    }
}
