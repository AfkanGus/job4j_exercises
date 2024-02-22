package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 10. Вывести четные и нечетные значения в разных строках
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел все значения массива таким образом: в первой строке
 * - все четные значения, содержащиеся в массиве, а во второй строке - все нечетные значения, содержащиеся в массиве.
 * <p>
 * Например, для массива значений [5, 2, 6, 0, 3, 4] вывод должен быть:
 * <p>
 * 2 6 0 4
 * <p>
 * 5 3
 */
public class Task72 {
    public static void array(int[] arr) {
        StringJoiner first = new StringJoiner(" ");
        StringJoiner last = new StringJoiner(" ");
        for (int i : arr) {
            if (i % 2 == 0) {
                first.add(String.valueOf(i));
            } else {
                last.add(String.valueOf(i));
            }
        }
        String firstString = first.toString();
        String lastString = last.toString();

        if (firstString.startsWith("\r\n")) {
            firstString = firstString.substring(2); // Удаляем первые два символа
        }
        if (lastString.startsWith("\r\n")) {
            lastString = lastString.substring(2); // Удаляем первые два символа
        }
        if (!firstString.isEmpty()) {
            System.out.println(firstString);
        }
        if (!lastString.isEmpty()) {
            System.out.println(lastString);
        }
      /*  if (first.length() > 0) {
            System.out.println(first);
        }
        if (last.length() > 0) {
            System.out.println(last);
        }*/
    }
}
