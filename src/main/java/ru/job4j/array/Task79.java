package ru.job4j.array;

import java.util.Arrays;

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
        /*
              StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                int count = 1; // Инициализируем счетчик для текущего числа
                // Подсчет количества повторений числа nums[i]
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                        nums[j] = Integer.MIN_VALUE; // Помечаем число как посещенное
                    }
                }

                // Если счетчик больше 1, значит число встречается больше одного раза
                if (count > 1) {
                    result.append(nums[i]).append(" ");
                }
            }
        }

        // Проверяем, есть ли значения, которые встречаются больше одного раза
        if (result.length() > 0) {
            // Выводим результат без конечных пробелов
            System.out.println(result.toString().trim());
        }
    }*/

        /*
        // Создаем HashMap для подсчета повторений элементов
        HashMap<Integer, Integer> map = new HashMap<>();

        // Проходим по массиву и добавляем каждый элемент в HashMap
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Создаем StringBuilder для хранения результата
        StringBuilder result = new StringBuilder();

        // Проходим по массиву и добавляем в StringBuilder только повторяющиеся элементы
        for (int num : nums) {
            if (map.get(num) > 1 && result.indexOf(num + " ") == -1) {
                result.append(num).append(" ");
            }
        }

        // Проверяем, есть ли значения, которые встречаются больше одного раза
        if (result.length() > 0) {
            // Выводим результат без конечных пробелов
            System.out.println(result.toString().trim());
        }
    }
         */
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Пропускаем элемент, если он уже был добавлен в результат
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result.append(nums[i]).append(" ");
                    break;
                }
            }
        }
        // Проверяем, есть ли значения, которые встречаются больше одного раза
        if (result.length() > 0) {
            // Выводим результат без конечных пробелов
            System.out.println(result.toString().trim());
        }
    }
}







