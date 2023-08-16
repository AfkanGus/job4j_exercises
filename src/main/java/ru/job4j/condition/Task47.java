package ru.job4j.condition;

/**
 * 47. Изменить трехзначное число в зависимости от условия
 * Ниже представлен метод changeNum(int number), который принимает целое трехзначное положительное число.
 * <p>
 * Задание: Написать код, который изменяет это число следующим образом:
 * <p>
 * - Для чисел, больших 500, переставляет местами числа единиц и сотен (вместо 347 - 743).
 * <p>
 * - В остальных числах переставляются местами числа десятков и единиц (вместо 474 - 447).
 * <p>
 * Результат вывести в консоль.
 * <p>
 * Например, вывод для числа 591 будет:
 * <p>
 * 195
 */
public class Task47 {
    public static void changeNum(int number) {
        if (number > 500) {
            int units = number % 10;
            int hundreds = (number / 100) % 10;
            int tens = (number / 10) % 10;

            int newNumber = units * 100 + tens * 10 + hundreds;

            System.out.println(newNumber);
        } else {
            int units = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = (number / 100) % 10;

            int newNumber = hundreds * 100 + units * 10 + tens;

            System.out.println(newNumber);
        }
    }
}
