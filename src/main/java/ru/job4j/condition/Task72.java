package ru.job4j.condition;

/**
 * 72. Является ли средняя цифра трехзначного числа больше остальных
 * Ниже представлен метод midDigitMore(int num), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который определяет, является ли средняя цифра этого числа больше остальных. Вывести в консоль "Да", если является, и
 * "Нет", если не является.
 * <p>
 * Например, для числа 132 вывод будет:
 * <p>
 * Да
 */
public class Task72 {
    public static void midDigitMore(int num) {
        if (num < 100 || num > 999) {
            System.out.println("Введите трехзначное число");
            return;
        }
        int firstDigit = num / 100;
        int lastDigit = num % 10;
        int middleDigit = (num / 10) % 10;

        if (middleDigit > firstDigit && middleDigit > lastDigit) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
