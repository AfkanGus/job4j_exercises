package ru.job4j.condition;

/**
 * 67. Являются ли три числа углами одного и того же треугольника
 * Ниже представлен метод isTriangle(int a, int b, int c), который принимает 3 целых числа - углы треугольника.
 * <p>
 * Задание: Написать код, который проверяет, являются ли эти числа углами одного и того же треугольника, и выводит в
 * консоль "Да", если являются, и "Нет", если не являются.
 * <p>
 * Примечание: Сумма углов в треугольнике равна 180 градусам.
 * <p>
 * Например, для чисел 60, 60, 70 вывод будет:
 * <p>
 * Нет
 */
public class Task67 {
    public static void isTriangle(int a, int b, int c) {
        if (a + b + c == 180) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
