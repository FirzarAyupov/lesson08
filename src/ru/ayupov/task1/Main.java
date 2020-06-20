package ru.ayupov.task1;

import static ru.ayupov.task1.Calculator.*;

/**
 * Реализовать класс Calculator, который будет содержать статические методы для операций вычитания, сложения,
 * умножения, деления и взятия процента от числа. Класс должен работать как с целыми числами, так и с дробями.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(sum(1.5, 2.9));

        System.out.println(diff(10, 5));
        System.out.println(diff(1.5, 2.9));

        System.out.println(multi(10, 5));
        System.out.println(multi(1.5, 2.9));

        System.out.println(div(10, 5));
        System.out.println(div(1.5, 2.9));

        System.out.println(per(10, 5));
        System.out.println(per(1.5, 2.9));
    }
}
