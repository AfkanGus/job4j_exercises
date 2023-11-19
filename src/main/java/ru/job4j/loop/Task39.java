package ru.job4j.loop;

/**
 * 39. Вывести числа, делящиеся без остатка на сумму своих цифр
 * Задание: Написать код, который выводит в консоль через пробел все целые числа от 200 до 210 (оба включительно),
 * которые делятся без остатка на сумму собственных цифр.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 200 201 204 207 209 210
 */
public class Task39 {
    public static void loop() {
        StringBuilder str = new StringBuilder();

        for (int i = 200; i <= 210; i++) {
            int number = i;
            int sumOfDigits = 0;

            // Вычисляем сумму цифр числа
            while (number != 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }

            // Проверяем условие и добавляем число в строку, если удовлетворяет
            if (i % sumOfDigits == 0) {
                str.append(i).append(" ");
            }
        }

        System.out.println(str.toString().trim());
    }
}
