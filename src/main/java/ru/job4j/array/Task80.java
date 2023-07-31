package ru.job4j.array;

/**
 * 4. Вернуть массив с номерами ячеек чисел, встречающихся один раз
 * Ниже представлен метод array(int[] arr), который
 * принимает массив целых чисел.
 * <p>
 * Задание: метод array должен возвращать массив, который содержит
 * номера ячеек входящего массива, в которых записаны значения,
 * встречающиеся в нем только один раз.
 * <p>
 * Например, для массива значений [5, 5, 4, 3, 3, 1]
 * нужно вернуть массив [2, 5].
 */
public class Task80 {
    public static int[] array(int[] nums) {
        int[] counts = new int[nums.length];
        int uniqueCount = 0;

        // Подсчет количества повторений каждого значения
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counts[i]++;
                }
            }
            // Увеличиваем uniqueCount только для уникальных значений
            if (counts[i] == 1) {
                uniqueCount++;
            }
        }

        // Создаем массив для хранения уникальных индексов
        int[] uniqueIndices = new int[uniqueCount];
        int index = 0;

        // Заполняем массив уникальными индексами
        for (int i = 0; i < nums.length; i++) {
            if (counts[i] == 1) {
                uniqueIndices[index++] = i;
            }
        }

        return uniqueIndices;
    }
}
