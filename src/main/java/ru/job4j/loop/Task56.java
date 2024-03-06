package ru.job4j.loop;

/**
 * Надо вывести количество чисел, которые больше, чем заданное число.
 * метод принимает массив чисел.
 * Задание: Написать код, который выводит в консоль количество чисел в
 * этом массиве, больших, чем первое число в нем.
 * <p>
 * Например, для массива [3, 1, 4, 2, 3] вывод должен быть:
 * <p>
 * 1
 */
public class Task56 {
    public static void loop(int[] array) {
        if (array.length == 0) {
            return;
        }
        int count = 0;
        int firstNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > firstNumber) {
                count++;
            }
        }
        System.out.println(count);
    }
}
