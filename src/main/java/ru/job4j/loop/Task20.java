package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 20. Вывести четырехзначные положительные числа в
 * убывающем порядке
 * Задание: Написать код, который выводит в
 * консоль через пробел в порядке убывания все
 * четырехзначные числа от 1050 до 1550, оканчивающиеся на 00.
 * Перед началом вывода нужно вывести слово "Начало" в отдельной
 * строке, а после окончания вывода чисел - слово "Конец",
 * тоже в отдельной строке.
 * <p>
 * Вывод должен получиться такой:
 * <p>
 * Начало
 * <p>
 * 1500 1400 1300 1200 1100
 * <p>
 * Конец
 */
public class Task20 {
    public static void loop() {
        System.out.println("Начало");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1500; i >= 1100; i -= 50) {
            int remainder = i % 100;
            switch (remainder) {
                case 0:
                    stringBuilder.append(i).append(" ");
                    break;
                default:
                    break;
            }
        }
            System.out.println(stringBuilder.toString().trim());
            System.out.println("Конец");
    }
}

