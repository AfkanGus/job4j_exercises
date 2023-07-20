package ru.job4j.condition;

/**
 * 33. Высчитать квадрат числа
 * Ниже представлен метод numSquare(int number),
 * который принимает целое число.
 * <p>
 * Задание: Написать код, который выводит в консоль
 * квадрат этого числа, если оно отрицательное,
 * иначе вывести "Ошибка".
 * <p>
 * Например, для числа 2 вывод будет:
 * <p>
 * Ошибка
 */
public class Task333 {
    public static void numSquare(int number) {
        String rsl = number < 0 ? Integer.toString(number * number) : "Ошибка";
        System.out.println(rsl);
    }
}
