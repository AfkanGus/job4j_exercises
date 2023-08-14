package ru.job4j.condition;

/**
 * 44. Вывести ближайшее "круглое число"
 * Ниже представлен метод getRoundNumber(int number), который принимает целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль ближайшее к данному "круглое число".
 * <p>
 * Например, для введенного числа 553 выводится 550, а для 78 выводится 80.
 */
public class Task44 {
    public static void getRoundNumber(int number) {
        /*int lowerRound = (number / 10) * 10; // Находим ближайшее меньшее круглое число
        int upperRound = lowerRound + 10;     // Находим ближайшее большее круглое число

        // Определяем, к какому из ближайших круглых чисел ближе введенное число
        int nearestRound = (number - lowerRound) < (upperRound - number) ? lowerRound : upperRound;
        System.out.println(nearestRound);*/

        /*функции Math.floor для округления вниз и Math.ceil для округления вверх числа*/
        int lowerRound = (int) Math.floor(number / 10.0) * 10; // Округление вниз
        int upperRound = (int) Math.ceil(number / 10.0) * 10;  // Округление вверх

        // Определяем, к какому из ближайших круглых чисел ближе введенное число
        int nearestRound = Math.abs(number - lowerRound) < Math.abs(upperRound - number) ? lowerRound : upperRound;
        System.out.println(nearestRound);
    }
}

