package ru.job4j.condition;

import java.util.StringJoiner;

/**
 * 40. "Дважды четное" трехзначное число
 * Ниже представлен метод isDoubleEven(int number),
 * который принимает целое трехзначное положительное число.
 * <p>
 * Трехзначное число является "дважды четным", если
 * и оно само, и сумма его цифр  - четные.
 * <p>
 * Задание: Написать код, который проверяет, является
 * ли входящее число "дважды четным". Если является - вывести
 * "Да", если нет - "Нет".
 * <p>
 * Например, вывод для числа 336 будет:
 * <p>
 * Да
 * <p>
 * Примечание: задание имеет решение с использованием
 * единственного оператора if - без составного условия.
 */
public class Task40 {
    public static void isDoubleEven(int number) {
        int f = number / 100;
        int s = (number % 100) / 10;
        int t = number % 10;
        int sum = f + s + t;
        if (number % 2 == 0 && sum % 2 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
