package ru.job4j.loop;

/**
 * 54. Вывести количество положительных чисел
 * Ниже представлен метод loop(int[] array), который принимает массив целых чисел.
 * <p>
 * Задание: Написать код, который выводит в консоль количество положительных значений входящего массива.
 * <p>
 * Например, для массива [2, -2, -1] вывод будет:
 * <p>
 * 1
 */
public class Task54 {
    public static void loop(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
