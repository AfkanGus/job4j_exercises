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
        String numStr = String.valueOf(number); // Преобразуем число в строку
        String[] digits = numStr.split(""); // Разделяем строку на отдельные символы

        int count = 0;
        for (String digitStr : digits) {
            int digit = Integer.parseInt(digitStr); // Преобразуем символ обратно в число
            if (digit % 2 == 0) { // Проверяем, является ли цифра четной
                count++;
            }
        }
        System.out.println(count);
     /*   int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        System.out.println(count);*/

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
