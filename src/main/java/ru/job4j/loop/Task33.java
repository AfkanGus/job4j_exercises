package ru.job4j.loop;

/**
 * 33. Вывести положительные трехзначные числа, делящиеся без
 * остатка на 11 (по возрастанию)
 * Задание: Написать код, который выводит в консоль через
 * пробел все целые положительные трехзначные числа до 160,
 * делящиеся без остатка на 11 (по возрастанию).
 * <p>
 * Вывод должен быть:
 * <p>
 * 110 121 132 143 154
 */
public class Task33 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 110; i <= 154; i++) {
            if (i % 11 == 0) {
                str.append(i).append(" ");

            }
        }
        System.out.println(str.toString().trim());
    }
}
