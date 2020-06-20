package ru.ayupov.task3;

import static ru.ayupov.task3.Convert.convert;

/**
 * Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт
 * (на вход передавать договор, на выходе получаем акт).
 */

public class Main {

    public static void main(String[] args) {
        Contract contract1 = new Contract(new String[]{"кирпич", "цемент"});
        System.out.println(contract1.toString());

        Act act1 = convert(contract1);
        System.out.println(act1.toString());
        System.out.println();


        Contract contract2 = new Contract(new String[]{"молоко", "мясо", "хлеб"});
        System.out.println(contract2.toString());

        Act act2 = convert(contract2);
        System.out.println(act2.toString());
        System.out.println();


        Contract contract3 = new Contract(new String[]{"молоко", "мясо", "хлеб"});
        System.out.println(contract3.toString());

        Act act3 = convert(contract3);
        System.out.println(act3.toString());
        System.out.println();


        Act act4 = convert(contract1);
        System.out.println(act4.toString());

    }
}
