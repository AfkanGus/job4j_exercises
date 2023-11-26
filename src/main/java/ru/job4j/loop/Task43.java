package ru.job4j.loop;

/**
 * 43. Вывести трехзначные числа при определенном условии
 * Задание: Написать код, который выводит в консоль через
 * пробел все целые числа от 300 до 325, в которых две
 * последних цифры (десятков и единиц) образуют двузначное
 * число, делящееся без остатка на первую цифру (сотен)
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 312 315 318 321 324
 */
public class Task43 {
    public static void loop() {
        /*
        % - деление без остатка
        / - деление с остатком
         */
        StringBuilder str = new StringBuilder();
        for (int i = 312; i <= 325; i++) {
            int tens = (i % 100) / 10;
            int units = (i % 100) % 10;
            int hundreds = i / 100;
            if ((tens * 10 + units) % hundreds == 0) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}
