package ru.job4j.condition;

/**
 * 78. На какие числа из составляющих входящее число цифр оно делится без остатка
 * Ниже представлен метод divWithoutRemainder(int num), который принимает целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который определяет и выводит в консоль, на какие числа из составляющих входящее число цифр оно делится без остатка. Если
 * таких чисел несколько, то вывести полученные значения через пробел. Если таких чисел нет - вывести "Таких чисел нет".
 * <p>
 * Примечание: Учесть возможность того, что одной из цифр входящего числа может быть ноль.
 * <p>
 * Например, для числа 456 вывод будет:
 * <p>
 * 4 6
 * Например, для числа 222 вывод будет:
 * <p>
 * 2 2 2
 * Например, для числа 100 вывод будет:
 * * <p>
 * 1
 * Например, для числа 223 вывод будет:
 * <p>
 * "Таких чисел нет"
 */
public class Task78 {
    public static void divWithoutRemainder(int num) {
        int digit1 = num / 100; // Получаем первую цифру
        int digit2 = (num / 10) % 10; // Получаем вторую цифру
        int digit3 = num % 10; // Получаем третью цифру

        StringBuilder result = new StringBuilder();

        if (digit1 != 0 && num % digit1 == 0) {
            result.append(digit1).append(" ");
        }
        if (digit2 != 0 && num % digit2 == 0) {
            result.append(digit2).append(" ");
        }
        if (digit3 != 0 && num % digit3 == 0) {
            result.append(digit3).append(" ");
        }

        if (result.length() > 0) {
            System.out.println(result.toString().trim());
        } else {
            System.out.println("Таких чисел нет");
        }
    /*    boolean found = false; // Флаг для определения, были ли найдены делители

        // Разбиваем число на цифры
        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int units = num % 10;

        // Проверяем, делится ли число на каждую из цифр без остатка
        if (hundreds != 0 && num % hundreds == 0) {
            System.out.print(hundreds + " ");
            found = true;
        }

        if (tens != 0 && num % tens == 0) {
            System.out.print(tens + " ");
            found = true;
        }

        if (units != 0 && num % units == 0) {
            System.out.print(units);
            found = true;
        }

        // Если не было найдено ни одного делителя, выводим "Таких чисел нет"
        if (!found) {
            System.out.print("Таких чисел нет");
        }

        System.out.println();*/
    }
}
