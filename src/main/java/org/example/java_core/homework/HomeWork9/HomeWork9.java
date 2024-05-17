package org.example.java_core.homework.HomeWork9;

public class HomeWork9 {
    public static void main(String[] args) {

        // Не правильный размер массива
        String[][] array1 = {
                {"1", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array1);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        // Не правиьлный формат данных
        String[][] array2 = {
                {"1", "two", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array2);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        // Вариант без исключений
        String[][] array3 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = sumArrayElements(array3);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int sumArrayElements(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 ) {
            throw new MyArraySizeException();
        }

        for (String[] subArray : array) {
            int counter = 0;
            for (String ignored : subArray) {
                counter++;
            }
            if (counter != 4)
                throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i=0; i < array.length; i++) {
            String[] subArray = array[i];
            for (int j=0; j < subArray.length; j++) {
                try {
                    int el = Integer.parseInt(subArray[j]);
                    sum += el;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке: [" + i + "][" + j + "] - \"" + array[i][j] + "\"");
                }
            }
        }
        return sum;
    }
}
