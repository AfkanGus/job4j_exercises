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
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int count = 1; // Initialize count for the current number
            if (nums[i] != Integer.MIN_VALUE) {
                // Count occurrences of nums[i]
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        count++;
                        nums[j] = Integer.MIN_VALUE; // Mark the number as visited
                    }
                }

                // If count is greater than 1, it means the number occurs more than once
                if (count > 1) {
                    result.append(nums[i]);
                    if (i < nums.length - 1) {
                        result.append(" ");
                    }
                }
            }
        }
        System.out.println(result); // Print the result using StringBuilder
    }
}




