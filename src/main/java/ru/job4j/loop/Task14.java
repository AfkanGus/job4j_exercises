package ru.job4j.loop;

import java.util.StringJoiner;

/**
 * 14. Вывод положительных двузначных чисел в диапазоне
 * Ниже представлен метод loop(int a, int b),
 * который принимает 2 целых числа.
 * <p>
 * Задание: Написать код, который выводит в консоль
 * через пробел все положительные двузначные числа в диапазоне
 * от первого числа (включая) до второго числа (не включая) в
 * возрастающем порядке. Перед началом вывода нужно вывести слово
 * "Старт" в отдельной строке, а после окончания вывода
 * <p>
 * чисел - слово "Финиш", тоже в отдельной строке.
 * <p>
 * Примечание: в этом и последующем упражнении для сборки
 * результирующей строки с выводом значений через пробел нужно
 * использовать StringJoiner.
 * <p>
 * Например, для чисел -16 и 15 вывод будет:
 * <p>
 * Старт
 * <p>
 * 10 11 12 13 14
 * <p>
 * Финиш
 */
public class Task14 {
    public static void loop(int a, int b) {
        StringJoiner rsl = new StringJoiner(" ");
        System.out.println("Старт");
        for (int i = a; i < b; i++) {
            if (i >= 10 && i < 100) {
                rsl.add(String.valueOf(i));
            }
        }
        System.out.println(rsl);
        System.out.println("Финиш");
    }
}

