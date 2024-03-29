package ru.job4j.array;

/**
 * 6. Найти количество отрицательных, положительных чисел и нулей в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: метод array должен возвращать массив, который содержит информацию о количестве отрицательных чисел, нулей
 * и положительных чисел (в этом же порядке).
 * <p>
 * Например, для массива значений [5, -5, -4, 0, 3, 1] нужно вернуть массив [2, 1, 3].
 */
public class Task81 {
    public static int[] array(int[] nums) {
        int countN = 0;
        int countZ = 0;
        int countP = 0;
        for (int num : nums) {
            if (num > 0) {
                countP++;
            } else if (num == 0) {
                countZ++;
            } else {
                countN++;
            }
        }
        return new int[]{countN, countZ, countP};
    }
}
