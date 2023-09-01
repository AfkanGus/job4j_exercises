package ru.job4j.condition;

/**
 * 61. Состоит ли трехзначное число из одинаковых цифр
 * Ниже представлен метод hasEqualDigits(int number), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который проверяет, состоит ли это число из одинаковых цифр, и выводит в консоль "Да", если
 * состоит, и "Нет", если не состоит.
 * <p>
 * Например, для числа 333 вывод будет:
 * <p>
 * Да
 */
public class Task61 {
    public static void hasEqualDigits(int number) {
        // Получаем цифры числа
        int digit1 = number % 10; // Последняя цифра
        int digit2 = (number / 10) % 10; // Средняя цифра
        int digit3 = number / 100; // Первая цифра

        // Проверяем, являются ли все цифры одинаковыми
        if (digit1 == digit2 && digit2 == digit3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
