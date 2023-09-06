package ru.job4j.condition;

/**
 * 73. Является ли средняя цифра трехзначного числа меньше остальных
 * Ниже представлен метод midDigitLess(int num), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который определяет, является ли средняя цифра этого числа меньше остальных.
 * Вывести в консоль "Да", если является, и
 * "Нет", если не является.
 * <p>
 * Например, для числа 426 вывод будет:
 * <p>
 * Да
 */
public class Task73 {
    public static void midDigitLess(int num) {
        if (!(100 <= num && num <= 999)) {
            System.out.println("Введите трехзначное число");
            return;
        }

        int firstDigit = num / 100;
        int lastDigit = num % 10;
        int middleDigit = (num / 10) % 10;

        if (middleDigit < firstDigit && middleDigit < lastDigit) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
