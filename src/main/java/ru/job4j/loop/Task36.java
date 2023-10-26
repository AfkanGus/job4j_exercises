package ru.job4j.loop;

/**
 * 36. Вывести двузначные числа, произведение которых является
 * двузначным числом
 * Задание: Написать код, который выводит в консоль через
 * пробел все положительные двузначные числа до 30,
 * произведение которых тоже является двузначным числом.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 25 26 27 28 29
 */
public class Task36 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 10; i <= 29; i++) {
            int f = i % 10;
            int s = i / 10;
            int z = f * s;
            if (z >= 10 && z < 29) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
