package org.example.java_core.homework.HomeWork9;

public class MyArrayDataException extends  Exception {
    public MyArrayDataException() {
        super("Не правильный формат числа");
    }

    public MyArrayDataException(String message) {
        super(message);
    }
}
