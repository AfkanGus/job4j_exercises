package ru.job4j.array;
import java.util.StringJoiner;
/**
 * 1. Вывести значения массива, начиная с первой ячейки
 * Ниже представлен метод array(int[] arr), который принимает массив целых
 * чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через
 * пробел все значения массива, начиная с первой ячейки.
 * <p>
 * Примечание: для сборки результирующей строки с выводом значений
 * через пробел нужно использовать StringJoiner в этой и последующих задачах.
 * <p>
 * Например, для массива значений [5, -2, 6, 0] вывод должен быть:
 * <p>
 * 5 -2 6 0
 */
public class Task68 {
    public static void array(int[] arr) {
        StringJoiner stringJoiner = new StringJoiner(" ");
        /* for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(String.valueOf(arr[i]));
        }
        System.out.println(stringJoiner);*/
        for (int value : arr) {
            stringJoiner.add(String.valueOf(value));
        }
        System.out.println(stringJoiner);
    }
}
