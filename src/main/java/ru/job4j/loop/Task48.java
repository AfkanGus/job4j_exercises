package ru.job4j.loop;

/**
 * 48. Вывести серию чисел от 1 до N с разделителем
 * Ниже представлен метод loop(int num), который принимает
 * целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль серию
 * чисел от 1 до входящего числа (включительно). Числа при
 * выводе должны разделяться знаком "+".
 * <p>
 * Например, для числа 5 вывод будет:
 * <p>
 * 1+2+3+4+5
 */
public class Task48 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            str.append(i);
            if (i < num) {
                str.append("+");
            }
        }
        System.out.println(str.toString().trim());
    }
}

