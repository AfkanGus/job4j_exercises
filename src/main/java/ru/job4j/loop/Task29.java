package ru.job4j.loop;

/**
 * 29. Вывести целые положительные трехзначные числа с условием
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел все целые
 * положительные трехзначные числа до 150, сумма цифр которых равна
 * входящему значению.
 * <p>
 * Например, для числа 5 вывод будет:
 * <p>
 * 104 113 122 131 140
 */
public class Task29 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 100; i <= 150; i++) {
            int hundredsDigit = i / 100;
            int tensDigit = (i / 10) % 10;
            int onesDigit = i % 10;
            if (hundredsDigit + tensDigit + onesDigit == num) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
