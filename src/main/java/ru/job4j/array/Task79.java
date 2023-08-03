package ru.job4j.array;

/**
 * 5. Вывести значения, которые встречаются больше одного раза
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через пробел только
 * те значения, которые встречаются в массиве больше одного раза.
 * <p>
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод должен быть:
 * <p>
 * 5 3
 */
public class Task79 {
    public static void array(int[] nums) {
        int[] counts = new int[nums.length];
        int uniqueCount = 0;

        // Подсчет количества повторений каждого значения
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    counts[i]++;
                }
            }
            if (counts[i] > 1) {
                uniqueCount++;
            }
        }

        int[] uniqueIndices = new int[uniqueCount];
        int index = 0;

        // Заполняем массив уникальными индексами
        for (int i = 0; i < nums.length; i++) {
            if (counts[i] > 1) {
                uniqueIndices[index++] = i;
            }
        }

        // Выводим значения, которые встречаются более одного раза
        for (int i = 0; i < uniqueIndices.length; i++) {
            System.out.print(nums[uniqueIndices[i]] + " ");
        }
    }
}



