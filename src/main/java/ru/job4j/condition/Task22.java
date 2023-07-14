package ru.job4j.condition;

/**
 * Ниже представлен метод haveRoots(int a, int b , int c),
 * который принимает три целых числа, являющихся коэффициентами
 * квадратного уравнения.
 * <p>
 * Задание: Написать код, который определяет, есть ли у
 * квадратного уравнения корни (решения).
 * <p>
 * Формула квадратного уравнения:
 * ax^2 + bx + c = 0 , где a ≠ 0 (в решении задачи эта формула не потребуется).
 * <p>
 * Вычислить есть ли корни (решения) у квадратного
 * уравнения можно с помощью дискриминанта.
 * <p>
 * Дискриминантом квадратного уравнения ax^2 + bx + c = 0
 * называется величина D = b^2 - 4ac, где D - дискриминант.
 * <p>
 * Если D < 0, значит действительных решений (корней) у
 * уравнения нет.
 * <p>
 * Вывести в консоль "Да", если решения (корни) есть,
 * или "Нет", если корни отсутствуют.
 */
public class Task22 {
    public static void haveRoots(int a, int b, int c) {
        int rsl = b * b - 4 * a * c;
        if (rsl < 0) {
            System.out.println("Нет");
        } else {
            System.out.println("Да");
        }
    }
}