package ru.job4j.array;

import java.util.StringJoiner;

/**
 * 3. Вывести значения, которые встречаются ровно один раз
 * Ниже представлен метод array(int[] arr), который принимает
 * массив целых чисел.
 * <p>
 * Задание: написать код, который выводит в консоль через
 * пробел только те значения, которые встречаются в массиве
 * ровно один раз.
 * <p>
 * Примечание: для сборки результирующей строки с выводом
 * значений через пробел нужно использовать StringJoiner в
 * этой и последующих задачах.
 * <p>
 * Например, для массива значений [5, 5, 4, 3, 3, 1] вывод
 * должен быть:
 * <p>
 * 4 1
 */
public class Task78 {
    public static void array(int[] nums) {
        StringJoiner joiner = new StringJoiner(" ");
        boolean foundUnique = false;

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                joiner.add(String.valueOf(nums[i]));
                foundUnique = true;
            }
        }

        if (foundUnique) {
            System.out.println(joiner);
        } else {
            System.out.println("");
        }
    }
}

