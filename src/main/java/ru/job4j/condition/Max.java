package ru.job4j.condition;

/**
 * 4.2. Тернарное сравнение.
 * String result = a + b > c ? "Условие выполняется" : "Условие не выполняется";
 */
public class Max {
    public static int max(int left, int right) {
       // int rsl = left;
       /* if (left <= right) {
            return right;
        }*/

        return left <= right ? right : left;
    }
}
