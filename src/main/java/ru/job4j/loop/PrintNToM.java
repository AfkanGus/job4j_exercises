package ru.job4j.loop;

/**
 * 2. Вывести на консоль числа от N до M
 * Выведите на консоль числа от N до M.
 * M не входит. В этом упражнении используйте
 * цикл for c index.
 */
public class PrintNToM {
    public static void out(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }
}
