package ru.job4j.loop;

/**
 * 57. Вывести количество чисел, которые больше, чем предыдущее
 * Ниже представлен метод loop(int[] array), который принимает массив целых чисел.
 * <p>
 * Задание: Написать код, который выводит в консоль количество чисел массива,
 * которые больше, чем предыдущее.
 * <p>
 * Например, для массива [0,  2, 1, 1, 2] вывод должен быть:
 * <p>
 * 2
 * array[i] > lastNumb - текущий сравниваем с предыдущим.
 */
public class Task57 {
    public static void loop(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            int lastNumb = array[i - 1];
            if (array[i] > lastNumb) {
                count++;
            }
        }
        System.out.println(count);
    }
}
