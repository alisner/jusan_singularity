package org.example.java_core.homework.HomeWork8;

public class HomeWork8 {
    public static void main(String[] args) {
         Movable[] participants = {
                 new Human("Egor", 2000, 1.5),
                 new Cat("Tom", 400, 1),
                 new Robot("AR-15", 100, 0.5)
         };

         Obstacle[] obstacles = {
                 new Treadmill(50),
                 new Wall(0.2),
                 new Treadmill(100),
                 new Wall(0.4),
                 new Treadmill(200),
                 new Wall(0.6),
                 new Treadmill(400),
                 new Wall(0.8),
                 new Treadmill(800),
                 new Wall(1),
                 new Treadmill(1600),
                 new Wall(2),
                 new Treadmill(3200),
         };

         for (Movable p : participants) {
             for (Obstacle o : obstacles) {
                 if (!o.pass(p))
                     break;
             }
             System.out.println();
         }
    }
}
