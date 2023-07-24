package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 16. Вывести все однозначные числа
 * Задание: Написать код, который выводит в консоль все однозначные
 * положительные числа. Перед началом вывода нужно вывести слово
 * "Старт" в отдельной строке, а после окончания вывода
 * чисел - слово "Финиш", тоже в отдельной строке.
 * <p>
 * Примечание: в этом и последующем упражнении для сборки
 * результирующей строки с выводом значений через пробел
 * нужно использовать StringJoiner.
 * <p>
 * <p>
 * Вывод должен получиться такой:
 * <p>
 * Старт
 * <p>
 * 1 2 3 4 5 6 7 8 9
 * <p>
 * Финиш
 */
public class Task16 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 1; i <= 9; i++) {
            stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}
