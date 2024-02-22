package ru.job4j.array;

/**
 * 7. Найти суммы отрицательных, положительных чисел и нулей в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
 * <p>
 * Задание: метод array должен возвращать массив, который содержит информацию о сумме положительных значений во
 * входящем массиве, сумме отрицательных значений, а также количестве нулей (в том же порядке).
 * <p>
 * Например, для массива значений [5, -3, -4, 0, 3, 1] нужно вернуть массив [9, -7, 1].
 */
public class Task82 {
    public static int[] array(int[] nums) {
        int countP = 0;
        int countN = 0;
        int countZ = 0;
        for (int num : nums) {
            if (num > 0) {
                countP += num;
            } else if (num < 0) {
                countN += num;
            } else {
                countZ++;
            }
        }
        return new int[]{countP, countN, countZ};
    }
}
