package ru.job4j.loop;

/**
 * 1. Вывести на консоль числа от 0 до N
 * Выведите на консоль числа от 0 до N. N не входит
 * . В этом упражнении используйте цикл for c index.
 */
public class PrintOToN {
    public static void out(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
