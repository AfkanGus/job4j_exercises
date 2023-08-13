package ru.job4j.condition;

/**
 * 42 Является ли четырехзначное число "парно-симметричным".
 * Ниже представлен метод isPairSymmetric(int number), который принимает целое четырехзначное положительное число.
 *
 * Четырехзначное число называется "парно-симметричным", если 2 его первых цифры и 2 его последних цифры образуют
 * одинаковые числа (Например, 5252).
 *
 * Задание: Написать код, который определяет, является ли входящее число "парно-симметричным", и выводит в консоль
 * "Да", если является или "Нет", если не является.
 *
 * Например, вывод для числа 4040 будет:
 *
 * Да
 */
public class Task42 {
    public static void isPairSymmetric(int number) {
        String numStr = Integer.toString(number);

        if (numStr.length() != 4) {
            System.out.println("Нет");
            return;
        }

        if (numStr.charAt(0) == numStr.charAt(2) && numStr.charAt(1) == numStr.charAt(3)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
        /*if (number < 1000 || number > 6400) {
            System.out.println("Нет");
            return;
        }

        int firstDigit = number / 1000;
        int secondDigit = (number / 100) % 10;
        int thirdDigit = (number / 10) % 10;
        int fourthDigit = number % 10;

        if (firstDigit == thirdDigit && secondDigit == fourthDigit) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/

      /*  String numStr = Integer.toString(number);

        if (numStr.length() != 4) {
            System.out.println("Нет");
            return;
        }

        String firstPart = numStr.substring(0, 2);
        String secondPart = numStr.substring(2);

        if (firstPart.equals(secondPart)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/
    }
}
