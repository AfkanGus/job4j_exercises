package ru.job4j.loop;

/**
 * 37. Вывести трехзначные числа по определенному условию
 * Задание: Написать код, который выводит в консоль через
 * пробел все целые положительные трехзначные числа до 130,
 * соответствующие следующему требованию: произведение
 * первой и последней цифр равно квадрату средней.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 100 111 124
 */
public class Task37 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 100; i <= 124; i++) {
            int f = i % 10; // Получить первую цифру числа
            int s = (i / 10) % 10; // Получить среднюю цифру числа
            int z = i / 100; // Получить последнюю цифру числа
            int fz = f * z;
            int ss = s * s;
            if (fz == ss) {
                str.append(i).append(" ");
            }
        }

        System.out.println(str.toString().trim());
    }
}
