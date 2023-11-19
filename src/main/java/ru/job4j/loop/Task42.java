package ru.job4j.loop;

/**
 * 42. Вывести числа, в которых цифры единиц и десятков
 * делятся на 3 с разным остатком
 * Задание: Написать код, который выводит в консоль через
 * пробел все целые числа от 20 до 30 (оба включая), в которых
 * и цифра единиц, и цифра десятков делятся на 3 с разным остатком.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 20 21 23 24 26 27 29
 */
public class Task42 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 20; i <= 30; i++) {
            int unitsDigit = i % 10;
            int testDigit = (i / 10) % 10;
            if ((unitsDigit % 3) != (testDigit % 3)) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
