package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 22. Вывести положительные трехзначные числа,
 * делящиеся на 80 с остатком 45
 * Задание: Написать код, который выводит в
 * консоль через пробел в порядке возрастания все
 * положительные трехзначные числа до 300, делящиеся
 * на 80 с остатком 45.
 * <p>
 * Вывод должен получиться такой:
 * <p>
 * 125 205 285
 */
public class Task22 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 100; i <= 300; i++) {
            if (i % 80 == 45) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
    }
}
