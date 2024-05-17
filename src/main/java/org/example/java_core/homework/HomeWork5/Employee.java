package org.example.java_core.homework.HomeWork5;

class Employee {
    private String fullName;
    private Position position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee() {
    }

    public Employee(String fullName, Position position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.printf("[fullName: %s, position: %s, email: %s, phone: %s, salary: %.2f, age: %d]\n", fullName, position, email, phone, salary, age);
    }
}
