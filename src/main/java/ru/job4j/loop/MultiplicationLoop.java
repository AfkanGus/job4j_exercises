package ru.job4j.loop;

/**
 * 6. Произведение чисел в диапазоне
 * Даны два целых числа a и b (a < b).
 * Найти произведение всех целых чисел от a до b включительно.
 */
public class MultiplicationLoop {

    public static int mult(int a, int b) {
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum = sum * i;
            System.out.println(sum);
        }
        return sum;
    }
}
