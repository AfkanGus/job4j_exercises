package ru.job4j.loop;

/**
 * 4. Вывести на консоль числа от M до N.
 * Нужно вывести числа от M до N. N не включено. M > N.
 */
public class BackwardFor {
    public static void out(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }
}
