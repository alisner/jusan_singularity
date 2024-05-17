package org.example.java_core.homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        guessTheNumber();
        guessTheWord();
    }

    public static void guessTheNumber() {
        Scanner scan = new Scanner(System.in);
        int resume = 1;

        while (resume == 1) {
            int num = (int) (Math.random() * 9);
            int attempts = 3;
            System.out.print("Угадайте число\n: ");

            int counter = 0;
            while (counter < attempts) {
                int userNum = scan.nextInt();
                if (userNum < num) {
                    System.out.printf("Ваше число меньше загаданного (осталось %d попыток)\n", attempts - counter - 1);
                } else if (userNum > num) {
                    System.out.printf("Ваше число больше загаданного (осталось %d попыток)\n", attempts - counter - 1);
                } else {
                    System.out.printf("Поздравляю, вы угадали число с %d раза\n", counter + 1);
                    counter += 3;
                }
                counter++;
            }
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
            resume = scan.nextInt();

            while (resume > 1 || resume < 0) {
                System.out.print("Введено неверное число, повторите попытку\n: ");
                resume = scan.nextInt();
            }
        }
    }

    public static void guessTheWord() {
        String[] words = {
                "apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String hiddenWord = words[(int) (Math.random() * 24)];

        boolean guessed = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Отгадайте слово:\n: ");

        while (!guessed) {
            String userWord = scan.nextLine().toLowerCase();
            StringBuilder builder = new StringBuilder();

            if (userWord.equals(hiddenWord)) {
                System.out.println("Верно!");
                guessed = true;
            } else {
                int length = Math.min(userWord.length(), hiddenWord.length());
                for (int i = 0; i < length; i++) {
                    Character char1 = userWord.charAt(i);
                    Character char2 = hiddenWord.charAt(i);

                    if (char1.equals(char2)) {
                        builder.append(char1);
                    } else {
                        builder.append("#");
                    }
                }

                if (builder.length() < 15)
                    for (int i = 0; i < 15 - builder.length(); i++)
                        builder.append("#");


                System.out.println("Вы не угадали");
                System.out.print(builder.toString() + "\n: ");
            }
        }
    }

}
