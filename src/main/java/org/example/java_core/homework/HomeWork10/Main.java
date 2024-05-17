package org.example.java_core.homework.HomeWork10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.removeByValue(3);
        list.print();

        list.add(0, 10);
        System.out.println("Элемент по индексу 2: " + list.get(2));
        System.out.println("Первый элемент: " + list.getFirst());
        System.out.println("Последний элемент: " + list.getLast());
        System.out.println("Содержит ли список значение 5: " + list.contains(5));
        System.out.println("Индекс элемента со значением 2: " + list.indexOf(2));
        list.removeByValue(2);
        list.removeByIndex(0);
        list.removeFirst();
        list.removeLast();
        list.add(15);
        list.set(0, 20);
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println("Размер списка: " + list.size());
        int[] array = list.toArray();
        list.clear();
        System.out.println("Пуст ли список: " + list.isEmpty());

        // void add(int index, int data);
        // int get(int index);
        // int getFirst();
        // int getLast();
        // boolean contains(int data);
        // void clear();
        // int indexOf(int data);
        // void remove(int data);
        // void remove(int index);
        // void removeFirst();
        // void removeLast();
        // void set(int index, int data);
        // int size();
        // int[] toArray();
        // boolean isEmpty()

    }
}
