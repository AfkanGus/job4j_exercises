package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 21. Вывести в порядке убывания положительные двузначные числа,
 * делящиеся на 5 без остатка
 * Задание: Написать код, который выводит в консоль через
 * пробел в порядке убывания все положительные двузначные числа
 * до 38, делящиеся на 5 без остатка. Перед началом вывода
 * нужно вывести слово "Старт" в отдельной строке, а после
 * окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 * <p>
 * Вывод должен получиться такой:
 * <p>
 * Старт
 * <p>
 * 35 30 25 20 15 10
 * <p>
 * Финиш
 * <p>
 * Каркас: r
 */
public class Task21 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = 35; i >= 10; i -= 5) {
                stringJoiner.add(String.valueOf(i));
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}
