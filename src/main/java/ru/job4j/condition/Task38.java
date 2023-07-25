package ru.job4j.condition;

import org.w3c.dom.ls.LSOutput;

/**
 * 37. Наибольшая цифра двузначного числа
 * Ниже представлен метод maxDigit(int number),
 * который принимает целое двузначное положительное число.
 * <p>
 * Задание: Написать код, который выводит на консоль наибольшую
 * из цифр этого числа. Если цифры равны - вывести "Равны".
 * <p>
 * Например, вывод для числа 37 будет:
 * <p>
 * 7
 */
public class Task38 {
    public static void maxDigit(int number) {
        if (number / 10 < number % 10) {
            System.out.println(number % 10);
        } else if (number / 10 > number % 10) {
            System.out.println(number / 10);
        } else {
            System.out.println("Равны");
        }
    }
}
