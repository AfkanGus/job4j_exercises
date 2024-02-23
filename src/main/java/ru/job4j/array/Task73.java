package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 11. Вывести симметричные ячейки массива
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом: в каждой строке
 * выводятся значения из двух ячеек, симметрично расположенных по отношению к середине массива. Если массив имеет
 * нечетный размер, то центральную ячейку нужно вывести в отдельной строке.
 * <p>
 * Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:
 * <p>
 * 5 3
 * <p>
 * 2 0
 * <p>
 * 6
 */
public class Task73 {
    public static void array(int[] arr) {
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            stringJoiner.add(String.valueOf(arr[i]));
            stringJoiner.add(String.valueOf(arr[arr.length - 1 - i]));
            System.out.println(stringJoiner);
        }
        if (arr.length % 2 != 0) {
            StringJoiner stringJoiner = new StringJoiner(" ");
            stringJoiner.add(String.valueOf(arr[mid]));
            System.out.println(stringJoiner);
        }
    }
}
