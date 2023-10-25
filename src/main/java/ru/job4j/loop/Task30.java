package ru.job4j.loop;

/**
 * Вывести трехзначные числа по определенному условию
 * Ниже представлен метод loop(int num), который принимает
 * целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль
 * через пробел все целые положительные трехзначные числа до 130, в
 * которых последняя цифра такая же, как и во входящем числе.
 * <p>
 * Например, для числа 34 вывод будет:
 * <p>
 * 104 114 124
 */
public class Task30 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 101; i <= 129; i++) {
            int lastDigit = i % 10;
            if (lastDigit == num % 10) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim()); // Перевод строки для завершения вывода.
    }
}





