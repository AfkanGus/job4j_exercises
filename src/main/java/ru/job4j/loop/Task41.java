package ru.job4j.loop;

/**
 * 41. Вывести числа, в которых цифры единиц и десятков делятся на 3 с
 * одинаковым остатком
 * Задание: Написать код, который выводит в консоль через пробел
 * все целые числа от 20 до 35 (оба включая), в которых
 * и цифра единиц, и цифра десятков делятся на 3 с одинаковым остатком.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 22 25 28 30 33
 */
public class Task41 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 20; i <= 35; i++) {
            int unitsDigit = i % 10; // единицы
            int tensDigit = (i / 10) % 10; // десятки
            /*делим без остатка*/
            if ((unitsDigit % 3) == (tensDigit % 3)) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
