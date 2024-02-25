package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 30. Посчитать количество учеников, получивших оценки
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел - оценки
 * учеников (могут быть от 1 до 5).
 * <p>
 * Задание: написать код, который выводит в консоль информацию о распределении оценок в
 * виде: "5: х, 4: х, 3: х, 2: х, 1: х", где х - количество
 * учеников, получивших данную оценку.
 * <p>
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
 * <p>
 * 5: 2, 4: 1, 3: 2, 2: 0, 1: 1
 */
public class Task76 {
    public static void array(int[] arr) {
   /*     Map<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        System.out.printf(
                "5: %s, 4: %s, 3: %s, 2: %s, 1: %s%n",
                map.getOrDefault(5, 0),
                map.getOrDefault(4, 0),
                map.getOrDefault(3, 0),
                map.getOrDefault(2, 0),
                map.getOrDefault(1, 0)
        );*/

       // Создаем массив для подсчета количества учеников для каждой оценки
        int[] counts = new int[5];

        // Подсчитываем количество учеников для каждой оценки
        for (int grade : arr) {
            counts[grade - 1]++;
        }

        // Создаем StringJoiner для формирования строки с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавляем информацию о распределении оценок в StringJoiner
        for (int i = 4; i >= 0; i--) {
            joiner.add((i + 1) + ": " + counts[i]);
        }

        // Выводим строку, сформированную StringJoiner
        System.out.println(joiner.toString());
    }
}

