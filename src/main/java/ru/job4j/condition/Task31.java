package ru.job4j.condition;

import java.util.Arrays;

/**
 * 32. Вывод чисел в определенном порядке.
 * Ниже представлен метод numCompare(int num1, int num2),
 * который принимает 2 целых числа.
 * <p>
 * Задание: Написать код, который выводит эти числа на консоль
 * в порядке возрастания в одной строке и в порядке убывания
 * в другой строке.
 * <p>
 * Например, для чисел 2 и -1 вывод будет:
 * <p>
 * -1 2
 * <p>
 * 2 -1
 */
public class Task31 {
   public static void numCompare(int num1, int num2) {
        if (num1 < num2) {
            System.out.println(num1 + " " + num2);
            System.out.println(num2 + " " + num1);
        } else if (num1 > num2) {
            System.out.println(num2 + " " + num1);
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num1 + " " + num2);
            System.out.println(num1 + " " + num2);
        }
    }
}