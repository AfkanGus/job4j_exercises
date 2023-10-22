package ru.job4j.loop;

/**
 * 27.  представлен метод loop(int num), который принимает
 * * целое положительное число.
 * * <p>
 * * Задание: Написать код, который выводит в консоль через
 * * пробел все целые числа из диапазона -num...num (не включая
 * * крайние значения диапазона).
 * * <p>
 * * Например, для числа 2 вывод будет:
 * * <p>
 * * -1 0 1
 * * <p>
 * * Например, для числа 1 вывод будет:
 * * <p>
 * * 0 8
 * * <p>
 * * Например, для числа 3 вывод будет:
 * * <p>
 * * -2 -1 0 1 2
 */
public class Task27 {
    public static void loop(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = -num + 1; i < num - 1; i++) {
            result.append(i).append(" ");
        }
        result.append(num - 1);
        System.out.println(result.toString());
    }
}

