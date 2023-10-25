package ru.job4j.loop;

/**
 * 34. Вывести нечетные числа
 * Ниже представлен метод loop(int num), который принимает целое
 * положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел
 * 5 последующих входящему числу нечетных чисел.
 * <p>
 * Например, для числа 6 вывод будет:
 * <p>
 * 7 9 11 13 15
 */
public class Task34 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        int input = num;
        int count = 0;
        int number = input + 1; // Начинаем с числа, следующего за входным значением

        while (count < 5) {
            if (number % 2 != 0) {
                str.append(number).append(" ");
                count++;
            }
            number++;
        }
        System.out.println(str.toString().trim());
    }
}
