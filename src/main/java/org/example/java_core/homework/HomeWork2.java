package org.example.java_core.homework;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();

        Car car = new Car("lada", 1);
        System.out.println(car.getId() + " " + car.getName());
    }

    public static void task1() {
        taskNumPrint(1);
        int[] array = {1,1,0,0,1,0,1,1,0,0};
        System.out.println("Исходный массив:" + Arrays.toString(array));
        for (int i=0; i<array.length;i++) {
            if (array[i] == 1) array[i] = 0;
            else if (array[i] == 0) array[i] = 1;
        }
        System.out.println("Итоговый массив:" + Arrays.toString(array));
    }

    public static void task2() {
        taskNumPrint(2);
        int[] array = new int[8];
        int num = 0;
        for (int i=0;i<array.length;i++) {
            array[i] = num;
            num += 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task3() {
        taskNumPrint(3);
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("Исходный массив:" + Arrays.toString(array));
        for (int i=0; i<array.length;i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        System.out.println("Итоговый массив:" + Arrays.toString(array));
    }

    public static void task4() {
        taskNumPrint(4);
        int size = 5;
        int[][] arr = new int[size][size];

        int j = size - 1;
        for (int i=0; i< arr.length;i++) {
            arr[i][i] = 1;
            arr[i][j] = 1;
            j--;
        }

        for (int[] i: arr) {
            for (int s: i) {
                System.out.print(s + "  ");
            }
            System.out.print("\n");
        }
    }

    public static void task5() {
        taskNumPrint(5);
        int[] arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println("Массив: " + Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void task6() {
        taskNumPrint(6);
        int[] arr = {1,1,1,2,1}; //{2,2,2,1,2,2,10,1};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Баланс: " + checkBalance(arr));
    }

    public static boolean checkBalance(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            int sum1 = 0;
            int sum2 = 0;

            for (int e1=0; e1<=i; e1++) {
                sum1 += arr[e1];
            }

            for (int e2=i+1; e2<arr.length; e2++) {
                sum2 += arr[e2];
            }

            if (sum1 == sum2)
                return true;
        }

        return false;
    }

    public static void task7() {
        taskNumPrint(7);
        int[] arr = {1,2,3,4,5};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        System.out.println("Итоговый массив: " + Arrays.toString(move(arr, -1)));
    }

    public static int[] move(int[] arr, int n) {

        if (n < 0) {
            n += arr.length;
        }

        int temp, prev;
            for (int i=0;i<n;i++) {
                prev = arr[arr.length-1];
                for (int j=0;j<arr.length;j++) {
                    temp = arr[j];
                    arr[j] = prev;
                    prev = temp;
                }
            }
        return arr;
    }


    public static void taskNumPrint(int n) {
        System.out.println("\nЗадача " + n);
    }
}
