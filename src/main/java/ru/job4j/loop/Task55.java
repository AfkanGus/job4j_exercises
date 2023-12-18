package ru.job4j.loop;

/**
 * 55. Вывести количество четных и нечетных чисел
 * Ниже представлен метод loop(int[] array), который принимает
 * массив целых чисел.
 * <p>
 * Задание: Написать код, который выводит в консоль количество
 * четных и нечетных значений входящего массива.
 * <p>
 * Вывод сделать в виде "Четных: x, нечетных: y", где x и
 * y - полученные значения.
 * <p>
 * Например, для массива [0, -1, 2] вывод должен быть:
 * <p>
 * Четных: 2, нечетных: 1
 */
public class Task55 {
    public static void loop(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }
        }
        System.out.println("Четных: " + evenCount + ", нечетных: " + oddCount);

    }
}
