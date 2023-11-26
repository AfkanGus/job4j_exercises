package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 45. Вывести трехзначные числа в определенном виде
 * Ниже представлен метод loop(int num), который принимает
 * целое положительное двузначное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел
 * все целые трехзначные числа от 100 до 500, в которых
 * входящее двузначное число является "внутренней" частью.
 * <p>
 * Примечание: для сборки результирующей строки с выводом значений
 * через пробел нужно использовать StringJoiner.
 * <p>
 * Например, для числа 23 вывод будет:
 * <p>
 * 123 223 323 423
 */
public class Task45 {
    public static void loop(int num) {
        StringJoiner str = new StringJoiner(" ");
        //нам нужно найти одинаковые последние цифры.
        for (int i = 100; i <= 500; i++) {
            int middleTwoDigits = i % 100;

            if (middleTwoDigits == num) {
                str.add(String.valueOf(i));
            }
        }
        System.out.println(str);
    }
}
