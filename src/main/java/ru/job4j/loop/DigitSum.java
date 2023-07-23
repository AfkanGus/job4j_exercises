package ru.job4j.loop;

/**
 * 13. Сумма цифр
 * Дано число, нужно получить сумму его цифр
 * <p>
 * Например,
 * <p>
 * 12 => 1 + 2 => 3
 */
public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

}
