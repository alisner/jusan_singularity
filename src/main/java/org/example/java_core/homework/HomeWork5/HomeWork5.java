package org.example.java_core.homework.HomeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivanov Ivan", Position.DIRECTOR, "ivanov@gmail.com", "88005553555", 999500, 56),
                new Employee("Timofeev Timur", Position.PROGRAMMER, "timofeev@gmail.com", "87057770659", 500000, 33),
                new Employee("Zhumabekov Altair", Position.MANAGER, "zhumabekov@gmail.com", "83925178635", 350000, 48),
                new Employee("Dudkin Daniil", Position.MANAGER, "dudkin@gmail.com", "89365279618", 310000, 24),
                new Employee("Itkulov Daniyar", Position.PROGRAMMER, "itkulov@gmail.com", "87964852986", 800000, 21),
        };

        for (Employee e : employees) {
            if (e.getAge() > 40)
                e.info();
        }
    }
}

