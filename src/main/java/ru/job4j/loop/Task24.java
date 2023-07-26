package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 24. Вывести ряд чисел с последующим уменьшением
 * Ниже представлен метод loop(int num), который принимает
 * целое число.
 * <p>
 * Задание: Написать код, который выводит в консоль через
 * пробел 5 чисел, отвечающих следующим условиям:
 * <p>
 * - Серия начинается с числа, которое меньше входящего на
 * 10.
 * <p>
 * - Каждое число в серии (начиная со второго) меньше
 * предыдущего на 6.
 * <p>
 * Например, для числа 50 вывод будет:
 * <p>
 * 40 34 28 22 16
 */
public class Task24 {
    public static void loop(int num) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = num - 10; i >= num - 34; i -= 6) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
    }

}
