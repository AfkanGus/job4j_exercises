package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 12. Вывести первую половину массива с начала, а вторую - с конца
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива
 * таким образом: в первой строке
 * выводятся значения из первой половины массива, начиная с начала, а во второй строке - из
 * второй половины массива,
 * начиная с конца. Если в массиве нечетное число ячеек, то центральная ячейка должна
 * быть на второй строке.
 * <p>
 * Например, для массива значений [1, 2, 3, 4, 5] вывод должен быть:
 * <p>
 * 1 2
 * <p>
 * 5 4 3
 */
public class Task74 {
    public static void array(int[] arr) {
        StringJoiner firstHalfArr = new StringJoiner(" ");
        StringJoiner secondHalfArr = new StringJoiner(" ");
        for (int i = 0; i < arr.length / 2; i++) {
            firstHalfArr.add(String.valueOf(arr[i]));
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            secondHalfArr.add(String.valueOf(arr[i]));
        }
        System.out.println(firstHalfArr);
        System.out.println(secondHalfArr);
    }
}
