package ru.job4j.loop;

/**
 * 9. Найти количество нечетных в диапазоне
 * Даны два целых положительных числа a и b (b > a).
 * Найти количество нечетных чисел в диапазоне [a, b].
 * Нечетным считается число,
 * у которого остаток от деления на 2 равен 1
 */
public class OddCount {
    public static int count(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        return count;
    }
}
