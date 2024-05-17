package org.example.java_core.homework.HomeWork9;

public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Неправильный размер массива");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
