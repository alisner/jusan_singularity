package org.example.java_core.homework.HomeWork6;

class Dog extends Animal {

    private int maxSwim;

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public Dog(String name, int maxRun, int maxJump, int maxSwim) {
        super(name, maxRun, maxJump);
        this.maxSwim = maxSwim;
    }

    private void swim(int v) {
        boolean b = v <= maxSwim;
        System.out.println("результат: swim: " + b);
    }

}
