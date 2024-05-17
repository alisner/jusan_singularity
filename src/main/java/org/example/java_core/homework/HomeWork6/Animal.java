package org.example.java_core.homework.HomeWork6;

class Animal {
    private String name;
    private int maxRun;
    private int maxJump;

    public Animal(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    private void run(int v) {
        boolean b = v <= maxRun;
        System.out.println("результат: run: " + b);
    }

    private void jump(int v) {
        boolean b = v <= maxJump;
        System.out.println("результат: jump: " + b);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(int maxJump) {
        this.maxJump = maxJump;
    }
}
