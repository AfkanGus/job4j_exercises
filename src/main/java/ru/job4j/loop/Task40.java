package ru.job4j.loop;

/**
 * 40. Вывести числа, в которых и цифра единиц, и цифра
 * десятков делятся без остатка на три
 * Задание: Написать код, который выводит в консоль через
 * пробел все целые числа от 20 до 40, в которых и цифра
 * единиц, и цифра десятков делятся без остатка на три
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 30 33 36 39
 */
public class Task40 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 20; i <= 40; i++) {
            int unitsDigit = i % 10; // единицы
            int tensDigit = (i / 10) % 10; // десятки
            /*делим без остатка*/
            if (unitsDigit % 3 == 0 && tensDigit % 3 == 0) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
