package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 2. Вывести значения массива, начиная с последней ячейки
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива, начиная с последней ячейки.
 * <p>
 * Примечание: для сборки результирующей строки с выводом значений через пробел нужно использовать StringJoiner в этой и последующих задачах.
 * <p>
 * Например, для массива значений [5, -2, 6, 0] вывод должен быть:
 * <p>
 * 0 6 -2 5
 */
public class Task69 {
    public static void array(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            stringJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(stringJoiner);
    }
}
