package ru.job4j.loop;

/**
 * 51. Вывести серию преобразованных чисел
 * Ниже представлен метод loop(int n, int m), который принимает
 * 2 целых положительных числа - n и m.
 * <p>
 * Задание: Написать код, который выводит в консоль ряд чисел от
 * n до m(оба включительно), отвечающие следующим
 * условиям:
 * <p>
 * - Если число нечетное - вывести квадрат этого числа.
 * <p>
 * - Если число четное - вывести ноль.
 * <p>
 * Примечание: Учитывать, что неизвестно какое число больше - n или m.
 * <p>
 * Например, для чисел 7 и 2 вывод будет:
 * <p>
 * 0 9 0 25 0 49
 */
public class Task51 {
    public static void loop(int n, int m) {
        // Определение начального и конечного числа для цикла
        int start = Math.min(n, m);
        int end = Math.max(n, m);
        // Создание объекта StringBuilder для построения строки
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            // Проверка, чтобы начать с первого четного числа
            if (i % 2 == 0) {
                // Добавление "0 " к строке, если число четное
                result.append("0 ");
            } else {
                // Добавление квадрата числа с десятичной точкой для
                // вычисления целого числа, если число нечетное
                result.append((int) Math.pow(i, 2)).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
