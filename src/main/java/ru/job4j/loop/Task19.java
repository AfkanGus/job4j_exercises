package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 19. Вывести положительные трехзначные числа, оканчивающиеся на 7
 * Задание: Написать код, который выводит в консоль через пробел в порядке возрастания все положительные трехзначные числа до 153 (не включая), оканчивающиеся на 7. Перед началом вывода нужно вывести слово "Старт" в отдельной строке, а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.
 * <p>
 * Вывод должен получиться такой:
 * <p>
 * Старт
 * <p>
 * 107 117 127 137 147
 * <p>
 * Финиш
 */
public class Task19 {
    public static void loop() {
        StringJoiner stringJoiner = new StringJoiner(" ");
        System.out.println("Старт");
       /* for (int i = 107; i <= 147; i += 10) {
                stringJoiner.add(String.valueOf(i));
        }*/
        for (int i = 107; i <= 147; i++) {
            if (i % 10 == 7) {
                stringJoiner.add(String.valueOf(i));
            }
        }
        System.out.println(stringJoiner);
        System.out.println("Финиш");
    }
}
