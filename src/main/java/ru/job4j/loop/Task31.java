package ru.job4j.loop;

/**
 * 31. Вывести двузначные числа, произведение цифр которых меньше
 * входящего числа
 * Ниже представлен метод loop(int num), который принимает целое
 * положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел
 * все целые положительные двузначные числа до 20
 * (включая), произведение цифр которых меньше входящего значения.
 * <p>
 * Например, для числа 5 вывод будет:
 * <p>
 * 10 11 12 13 14 20
 */
public class Task31 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        for (int i = 10; i <= 20; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            if ((firstDigit * lastDigit) < num) {
                str.append(i).append(" ");
            }

        }
        System.out.println(str.toString().trim());
    }
}
