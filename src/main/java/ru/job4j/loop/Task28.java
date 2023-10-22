package ru.job4j.loop;

/**
 * 28. Вывести целые положительные двузначные числа с условием
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел все целые
 * положительные двузначные числа до 30, сумма цифр которых равна входящему
 * значению.
 * <p>
 * Например, для числа 6 вывод будет:
 * <p>
 * 15 24
 */
public class Task28 {
    public static void loop(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 10; i <= 30; i++) {
            int tensDigit = i / 10;
            int onesDigit = i % 10;
            if (tensDigit + onesDigit == num) {
                result.append(i).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
