package ru.job4j.condition;

/**
 * 58. Счастливый билет
 * Ниже представлен метод isWinning(int number), который принимает целое шестизначное число.
 * <p>
 * В этой задаче нужно определить выигрышный билет. Пусть выигрышным считается такой билет, где сумма первых трех
 * цифр входящего числа равна сумме последних трех цифр этого числа, и обе эти суммы являются четными.
 * <p>
 * Задание: Написать код, который проверяет, является ли такой билет выигрышным, и выводит в консоль "Да", если
 * является, и "Нет", если не является.
 * <p>
 * Например, для числа 145505 вывод будет:
 * <p>
 * Да
 */
public class Task58 {
    public static void isWinning(int number) {
        /*
        int digit1 = number / 100000 % 10;
        int digit2 = number / 10000 % 10;
        int digit3 = number / 1000 % 10;
        int digit4 = number / 100 % 10;
        int digit5 = number / 10 % 10;
        int digit6 = number % 10;

        // Вычисляем суммы первых и последних трех цифр
        int sumFirstThree = digit1 + digit2 + digit3;
        int sumLastThree = digit4 + digit5 + digit6;

        // Проверяем, являются ли обе суммы четными и равными
        if (sumFirstThree % 2 == 0 && sumLastThree % 2 == 0 && sumFirstThree == sumLastThree) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/
      /*  String numberStr = String.valueOf(number);

        if (numberStr.length() != 6) {
            System.out.println("Нет");
            return; // Выйти из метода, так как число не является шестизначным.
        }

        int sumFirstThree = 0;
        int sumLastThree = 0;

        for (int i = 0; i < 6; i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (i < 3) {
                sumFirstThree += digit;
            } else {
                sumLastThree += digit;
            }
        }

        if (sumFirstThree % 2 == 0 && sumLastThree % 2 == 0 && sumFirstThree == sumLastThree) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/
        // Создаем массив для хранения цифр
        int[] digits = new int[6];

        // Заполняем массив цифрами числа, начиная с последней цифры
        for (int i = 5; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Вычисляем суммы первых и последних трех цифр
        int sumFirstThree = 0;
        int sumLastThree = 0;

        for (int i = 0; i < 3; i++) {
            sumFirstThree += digits[i];
            sumLastThree += digits[i + 3];
        }

        // Проверяем условия выигрыша
        if (sumFirstThree % 2 == 0 && sumLastThree % 2 == 0 && sumFirstThree == sumLastThree) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
