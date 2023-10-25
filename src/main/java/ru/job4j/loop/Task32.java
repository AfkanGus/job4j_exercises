package ru.job4j.loop;

/**
 * 32. Вывести положительные двузначные числа, заканчивающиеся на
 * цифру 7 (по убыванию)
 * Задание: Написать код, который выводит в консоль через пробел
 * все целые положительные двузначные числа до 50,
 * заканчивающиеся на цифру 7 (по убыванию).
 * <p>
 * Вывод должен быть:
 * <p>
 * 47 37 27 17
 */
public class Task32 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 47; i >= 17; i--) {
            int last = i % 10;
            if (last == 7) {
                str.append(i).append(" ");
            }

        }
        System.out.println(str.toString().trim());
    }
}
