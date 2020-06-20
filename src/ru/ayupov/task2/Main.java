package ru.ayupov.task2;

import static ru.ayupov.task2.Counter.getCount;

/**
 * Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов.
 * Написать метод для получения информации о количестве.
 */

public class Main {
    public static void main(String[] args) {
        Counter classname1 = new Counter();
        getCount();

        Counter classname2 = new Counter();
        getCount();

        Counter classname3 = new Counter();
        getCount();

        Counter classname4 = new Counter();
        getCount();

    }

}
