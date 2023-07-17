package ru.job4j.condition;

/**
 * 31. Вывод разницы или произведения двух чисел в
 * зависимости от условия
 * Ниже представлен метод calculate(int num1,
 * int num2), который принимает 2 целых положительных числа.
 * <p>
 * Задание: Написать код, который выводит в консоль
 * разницу между первым и вторым числом, если первое
 * больше второго, разницу между вторым и первым числом,
 * <p>
 * если второе больше первого или произведение этих чисел,
 * если они равны.
 * <p>
 * Например, для чисел 2 и 5 вывод будет:
 * <p>
 * 3
 */
public class Task32 {
    public static void calculate(int num1, int num2) {
        /*if (num1 > num2) {
            System.out.println(num1 - num2);
        } else if (num2 > num1) {
            System.out.println(num2 - num1);
        } else {
            System.out.println(num1 * num2);
        }*/
        int rsl = (num1 > num2) ? (num1 - num2) : ((num2 > num1) ? (num2 - num1) : (num1 * num2));
        System.out.println(rsl);
    }
}
