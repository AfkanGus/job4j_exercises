package ru.job4j.condition;

/**
 * 43. Содержится ли в трехзначном числе хотя бы один ноль
 * Ниже представлен метод containsZero(int number), который принимает
 * целое трехзначное положительное число.
 * <p>
 * Задание: Написать код, который определяет, содержится ли в этом числе
 * хотя бы один ноль, и выводит в консоль "Да",
 * если содержится или "Нет", если не содержится.
 * <p>
 * Например, вывод для числа 407 будет:
 * <p>
 * Да
 */
public class Task43 {
    public static void containsZero(int number) {
        int[] digits = new int[3];
        int temp = number;

        for (int i = 2; i >= 0; i--) {
            /*Например, если temp равно 123, то temp % 10 вернет 3.*/
            digits[i] = temp % 10;
            /* Например, если temp равно 123, после выполнения temp будет равно 12.*/
            temp /= 10;
        }

        for (int digit : digits) {
            if (digit == 0) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
        /* еще один способ
        String numStr = String.valueOf(number);

        if (numStr.contains("0")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }*/

       /* еще один способ
       int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;

        if (digit1 == 0 || digit2 == 0 || digit3 == 0) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/
    }
}
