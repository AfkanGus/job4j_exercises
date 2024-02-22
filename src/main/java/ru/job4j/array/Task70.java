package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 8. Вывести значения массива в 2 строках
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке
 * - первую половину массива, во второй строке - вторую половину массива. Если массив имеет нечетный размер, то
 * центральную ячейку нужно вывести в первой строке.
 * <p>
 * Примечание: для сборки результирующих строк с выводом значений через пробел нужно использовать StringJoiner.
 * <p>
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 * <p>
 * 5 2 6
 * <p>
 * 0 3
 * * Например, для массива значений [2, 0, 0, 3, 3, 1, 5] вывод должен быть:
 * * <p>
 * * 2 0 0 3
 * * <p>
 * * 3 1 5
 * Например, для массива значений [2, 4, 6, 7] вывод должен быть:
 * 2 4
 * <p>
 * 6 7
 * </p>
 */
public class Task70 {
    public static void array(int[] arr) {
        StringJoiner first = new StringJoiner(" "); // Создаем StringJoiner для первой половины
        StringJoiner last = new StringJoiner(" "); // Создаем StringJoiner для второй половины

// Добавляем элементы первой половины массива в StringJoiner first
        for (int i = 0; i < arr.length / 2; i++) {
            first.add(String.valueOf(arr[i]));
        }

// Если длина массива четная, добавляем центральный элемент в StringJoiner last, иначе в StringJoiner first
        if (arr.length % 2 != 0) {
            first.add(String.valueOf(arr[arr.length / 2]));
        } else {
            last.add(String.valueOf(arr[arr.length / 2]));
        }

// Добавляем элементы второй половины массива в StringJoiner last
        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            last.add(String.valueOf(arr[i]));
        }
        System.out.println(first);
        System.out.println(last);
    }
}
