package ru.job4j.condition;

/**
 * 41. Найти количество четных цифр трехзначного числа
 * Ниже представлен метод evenDigitsAmount(int number),
 * который принимает целое трехзначное положительное число.
 * <p>
 * Задание: Написать код, который находит и выводит в
 * консоль количество четных цифр в этом числе..
 * <p>
 * Например, вывод для числа 320 будет:
 * <p>
 * 2
 */
public class Task41 {
    public static void evenDigitsAmount(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count);

       /* int count = 0;
        int f = number / 100;
        int s = (number % 100) / 10;
        int t = number % 10;

        if (f % 2 == 0) {
            count++;
        }
        if (s % 2 == 0) {
            count++;
        }
        if (t % 2 == 0) {
            count++;
        }
        System.out.println(count);*/
    }
}
