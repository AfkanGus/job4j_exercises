package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 23. Вывести ряд чисел с последующим увеличением
 * Ниже представлен метод loop(int num), который принимает
 * целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через
 * пробел 5 чисел, отвечающих следующим условиям:
 * <p>
 * - Серия начинается с числа, которое больше входящего на 1.
 * <p>
 * - Каждое число в серии (начиная со второго) больше
 * предыдущего на 1.
 * <p>
 * Например, для числа 10 вывод будет:
 * <p>
 * 11 12 13 14 15
 */
public class Task23 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num + 1; i <= num + 5; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }
}
