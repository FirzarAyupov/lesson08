package ru.ayupov.task3;

import java.time.LocalDate;
import java.util.Arrays;

public class Document {
    int number;
    LocalDate date;
    String[] products;
    private String docType = "Документ";

    protected Document(int number, String[] products) {
        this(number, LocalDate.now(), products);
    }

    protected Document(int number, LocalDate date, String[] products) {
        this.number = number;
        this.date = date;
        this.products = products;
    }

    @Override
    public String toString() {
        String result = docType + " № " + number + " от " + date + " числа. " + "Продукты: " + Arrays.toString(products);
        return result;
    }
}
