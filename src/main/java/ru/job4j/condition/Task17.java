package ru.job4j.condition;

/**
 * 17. Вывести знак числа.
 * Задание: Написать код, который выводит в
 * консоль одно из слов: "Положительное",
 * "Ноль" или "Отрицательное", в зависимости
 * от значения входящего числа.
 */
public class Task17 {
    public static void signCheck(int number) {
        if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }
    }
}
