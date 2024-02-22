package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 9. Вывести значения из четных и нечетных ячеек массива в разных строках
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке
 * - значения из четных ячеек массива, а во второй строке - из нечетных.
 * <p>
 * Примечание: для сборки результирующих строк с выводом значений через пробел нужно использовать StringJoiner.
 * <p>
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 * <p>
 * 5 6 3
 * <p>
 * 2 0
 */
public class Task71 {
    public static void array(int[] arr) {
        StringJoiner first = new StringJoiner(" ");
        StringJoiner last = new StringJoiner(" ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                first.add(String.valueOf(arr[i]));
            } else {
                last.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}
