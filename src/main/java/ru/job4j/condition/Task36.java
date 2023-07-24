package ru.job4j.condition;

/**
 * 36. Состоит ли двузначное число из одинаковых цифр
 * Ниже представлен метод sameNums(int number),
 * который принимает целое двузначное положительное число.
 * <p>
 * Задание: Написать код, который проверяет,
 * состоит ли это число из одинаковых цифр.
 * Вывести в консоль "Да", если состоит, и "Нет",
 * если не состоит.
 * <p>
 * Например, для числа 33 вывод будет:
 * <p>
 * Да
 */
public class Task36 {
    public static void sameNums(int number) {
        int f = number / 10;
        int s = number % 10;
        while (number >= 10) {
            number = f;
            if (f != s) {
                System.out.println("Нет");
                return;
            }
        }
        System.out.println("Да");
    }
}
