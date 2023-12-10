package ru.job4j.loop;

import java.util.StringJoiner;


/**
 * 46. Вывести четырехзначные числа в определенном виде
 * Ниже представлен метод loop(int num), который принимает целое
 * положительное двузначное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел все
 * целые четырехзначные числа от 1000 до 1500, в
 * которых входящее двузначное число является средней "внутренней"
 * частью.
 * <p>
 * Например, для числа 23 вывод будет:
 * <p>
 * 1230 1231 1232 1233 1234 1235 1236 1237 1238 1239
 */
public class Task46 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 1110; i <= 1500; i++) {
            /*вторая цифра */
            int secondDigit = (i / 100) % 10;
            /* третья цифра*/
            int rhirdDigit = (i / 10) % 10;

            if (secondDigit == num / 10 && rhirdDigit == num % 10) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
