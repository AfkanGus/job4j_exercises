package ru.job4j.condition;

/**
 * 62. Расположены ли цифры трехзначного числа в порядке возрастания
 * Ниже представлен метод isRising(int number), который принимает целое трехзначное число, состоящее из 3 разных цифр.
 * <p>
 * Задание: Написать код, который проверяет, располагаются ли цифры этого числа в порядке возрастания (первая -
 * наименьшая, третья - наибольшая, все цифры разные), и выводит в консоль "Да", если располагаются, и "Нет", если не
 * располагаются.
 * <p>
 * Например, для числа 156 вывод будет:
 * <p>
 * Да
 */
public class Task62 {
    public static void isRising(int number) {
        int digit1 = number % 10; // Последняя цифра
        int digit2 = (number / 10) % 10; // Средняя цифра
        int digit3 = number / 100; // Первая цифра
        if (digit1 > digit2 && digit2 > digit3) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
