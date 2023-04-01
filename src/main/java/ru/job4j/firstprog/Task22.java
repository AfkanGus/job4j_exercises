package ru.job4j;

/**
 * 22. Форматированный вывод.
 */
public class Task22 {
    public static void nameInsert(String name) {
        String rsl = String.format("Привет, %s!", name);
        System.out.println(rsl);
    }
}
