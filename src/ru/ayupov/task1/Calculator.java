package ru.ayupov.task1;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculator {

    public static double sum(double num1, double num2) {
        printInfo(num1, num2, "+");
        return num1 + num2;
    }

    public static double diff(double num1, double num2) {
        printInfo(num1, num2, "-");
        return num1 - num2;
    }

    public static double multi(double num1, double num2) {
        printInfo(num1, num2, "*");
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        printInfo(num1, num2, "/");
        if (num2 > 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public static double per(double num1, double num2) {
        printInfo(num1, num2, "%");
        return num2 * 100 / num1;
    }

    private static void printInfo(double num1, double num2, String operation) {
        String result = "";
        NumberFormat nf = new DecimalFormat("#.##########################");
        String num1Str = nf.format(num1);
        String num2Str = nf.format(num2);

        switch (operation) {
            case "+":
                result += "Сложение: " + num1Str + " + " + num2Str + " = ";
                break;
            case "-":
                result += "Вычитание: " + num1Str + " - " + num2Str + " = ";
                break;
            case "*":
                result += "Умножение: " + num1Str + " х " + num2Str + " = ";
                break;
            case "/":
                result += "Деление: " + num1Str + " / " + num2Str + " = ";
                break;
            case "%":
                result += "Взятие процента: " + num1Str + " % " + num2Str + " = ";
                break;
        }
        System.out.print(result);
    }
}


