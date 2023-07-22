package ru.job4j.loop;

/**
 * 7. Найти степень числа
 * Дано целое число a и целое число n (> 0).
 * Найти a в степени n: a^n = a·a· . . . ·a
 * (числа a перемножаются n раз).
 */
public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = 1;
        for (int i = 0; i < n; i++) {
            rsl *= a;
        }
        return rsl;
    }
}
