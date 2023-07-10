package ru.job4j.condition;

/**
 * Задание: Написать код, который выводит в
 * консоль слово "Zero", если число - ноль,
 * либо "Not zero", если число не ноль.
 */
public class Task16 {
    public static void zeroCheck(int number) {
       System.out.println(number == 0 ? "Zero" : "Not zero");
    }
}
