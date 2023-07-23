package ru.job4j.loop;

/**
 * 12. mod через while
 * Есть операция остаток от деления %. Вам даны два целых
 * положительных числа числа n и d (d > 0).
 * n это делимое, d это делитель. Вам нужно
 * не используя операцию %, найти остаток от деления.
 */
public class ModWithLoop {
    public static int mod(int n, int d) {
        return n < d ? n : mod(n - d, d);
    }
}
