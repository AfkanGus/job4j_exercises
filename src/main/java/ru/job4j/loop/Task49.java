package ru.job4j.loop;

/**
 * 49. Вывести все четные числа от N до M
 * Ниже представлен метод loop(int n, int m), который принимает 2 целых положительных числа.
 * <p>
 * Задание: Написать код, который выводит в консоль все четные числа от n до m (оба включительно). Числа при выводе
 * должны разделяться знаком "+". Учитывать, что неизвестно какое из чисел больше - n или m.
 * <p>
 * Например, для чисел 10 и 3 вывод будет:
 * <p>
 * 4+6+8+10
 */
public class Task49 {
    public static void loop(int n, int m) {
        // Определение начального и конечного числа для цикла
        int start = Math.min(n, m);
        int end = Math.max(n, m);

        StringBuilder result = new StringBuilder();

        // Проверка, чтобы начать с первого четного числа
        if (start % 2 != 0) {
            start++;
        }

        // Цикл по всем четным числам от start до end
        for (int i = start; i <= end; i += 2) {
            result.append(i);

            // Добавление знака "+" после каждого числа, кроме последнего
            if (i < end - 1) {
                result.append("+");
            }
        }

        System.out.println(result.toString());
    }
}
