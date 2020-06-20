package ru.ayupov.task3;

import java.time.LocalDate;
import java.util.Arrays;

public class Contract extends Document {
    static int count = 0;
    private static String docType = "Договор";

    public Contract(String[] products) {
        this(++count, products);
    }

    public Contract(int number, String[] products) {
        super(number, products);
    }

    public Contract(int number, LocalDate date, String[] products) {
        super(number, date, products);
    }

    @Override
    public String toString() {
        String result = docType + " № " + number + " от " + date + " числа. " + "Продукты: " + Arrays.toString(products);
        return result;
    }
}
