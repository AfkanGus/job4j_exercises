package ru.job4j.loop;

/**
 * /**
 * * 47. Вывести четырехзначные числа с определенным условием
 * * Задание: Написать код, который выводит в консоль через
 * * пробел все целые числа от 1345 до 1445, в которых и сумма
 * * первых двух цифр, и сумма последних двух цифр равна 5.
 * * <p>
 * * Вывод должен быть такой:
 * * <p>
 * * 1405 1414 1423 1432 1441
 */

public class Task47 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
        for (int i = 1345; i < 1445; i++) {
            // Сумма первых двух цифр
            int firstTwoDigitsSum = (i / 1000) + ((i / 100) % 10);
            // Сумма последних двух цифр
            int lastTwoDigitsSum = ((i / 10) % 10) + (i % 10);

            if (firstTwoDigitsSum == 5 && lastTwoDigitsSum == 5) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
