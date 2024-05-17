package org.example.java_core.homework.HomeWork8;

public class Wall implements Obstacle {
    private final double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean pass(Movable player) {
        return player.jump(height);
    }
}
