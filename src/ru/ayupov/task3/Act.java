package ru.ayupov.task3;

import java.time.LocalDate;
import java.util.Arrays;

public class Act extends Document {
    static int count = 0;
    private static String docType = "Акт";

    public Act(Contract contract) {
        this(contract.products);
    }

    public Act(String[] products) {
        this(++count, products);
    }

    public Act(int number, String[] products) {
        super(number, products);
    }

    public Act(int number, LocalDate date, String[] products) {
        super(number, date, products);
    }


    @Override
    public String toString() {
        String result = docType + " № " + number + " от " + date + " числа. " + "Продукты: " + Arrays.toString(products);
        return result;
    }
}
