package ru.job4j.condition;

import java.util.HashSet;
import java.util.Set;

/**
 * 77. Количество разных цифр в трехзначном числе
 * Ниже представлен метод diffNumAmount(int num), который принимает целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который определяет и выводит в консоль количество разных цифр в этом числе.
 * <p>
 * Например, для числа 225 вывод будет:
 * <p>
 * 2
 * <p>
 * а для числа 222 вывод будет:
 * <p>
 * 0
 * <p></p>
 */
public class Task77 {
    public static void diffNumAmount(int num) {
        if (num >= 100 && num <= 999) { // Проверка, что число трехзначное
            Set<Integer> uniqueDigits = new HashSet<>(); // Множество для уникальных цифр

            while (num > 0) {
                int digit = num % 10; // Получаем последнюю цифру числа
                uniqueDigits.add(digit); // Добавляем цифру в множество
                num /= 10; // Убираем последнюю цифру из числа
            }

            int differentDigits = uniqueDigits.size(); // Количество уникальных цифр

            if (differentDigits == 1) {
                differentDigits = 0; // Если все цифры одинаковые, устанавливаем 0
            }

            System.out.println(differentDigits);
        }
    }
}
