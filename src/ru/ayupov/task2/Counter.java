package ru.ayupov.task2;

public class Counter {
    private static int count = 0;

    public Counter() {
        System.out.println("Создан новый объект Counter");
        count++;
    }

    public static void getCount() {
        System.out.println("Количество объектов Counter - " + count);
    }
}
