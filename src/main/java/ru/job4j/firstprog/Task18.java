package ru.job4j.firstprog;

import java.util.Scanner;

/**
 * 18. Простые геометрические вычисления
 * Дана сторона квадрата a. Найти его периметр.
 * <p>
 * Дан радиус окружности r. Найти длину окружности и площадь круга.*
 * <p>
 * Результат каждого вычисления выводите в новой строке с точностью до десятых.
 * <p>
 * *при расчётах используйте вызов Math.PI
 */

public class Task18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double r = input.nextDouble();
        double square = a * 4;
        String rsl = String.format("%.1f%s", square, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
        double length = 2 * Math.PI * r;
        String rslLength = String.format("%.1f%s", length, System.lineSeparator()).replace(',', '.');
        System.out.printf(rslLength);
        double s = Math.PI * Math.pow(r, 2);
        String rslS = String.format("%.1f%s", s, System.lineSeparator()).replace(',', '.');
        System.out.printf(rslS);

    }
}
