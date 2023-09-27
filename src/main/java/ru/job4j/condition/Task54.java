package ru.job4j.condition;

/**
 * 53. Преобразовать трехзначное число в зависимости от условия
 * Ниже представлен метод transform(int number), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который выполняет следующее:
 * <p>
 * - Если число четное - все четные цифры этого числа увеличиваются на 1, а нечетные - уменьшаются на 1. Если
 * увеличение/уменьшение невозможно (например, увеличить 9), то оставить эту цифру без изменения.
 * <p>
 * - Если число нечетное, то все изменения произвести наоборот - четные цифры уменьшить на 1, нечетные - увеличить на 1.
 * <p>
 * Получившееся число вывести в консоль.
 * * <p>
 * * Например, для числа 390 вывод будет:
 * * <p>
 * * 281
 * * <p>
 * * Например, для числа 333 вывод будет:
 * * <p>
 * * 444
 * * <p>
 * * Например, для числа -900 вывод будет:
 * * <p>
 * * -811
 * * <p>
 * * Например, для числа 999 вывод будет:
 * * <p>
 * * 999
 * * <p>
 * * Например, для числа -109 вывод будет:
 * * <p>
 * * -209
 * * <p>
 * * Например, для числа 100 вывод будет:
 * * <p>
 * * 11
 * * <p>
 */
public class Task54 {
    public static void transform(int number) {
        if (number >= 100 && number <= 999) { // Проверяем, что число трехзначное
            int digit1 = number / 100; // Получаем первую цифру
            int digit2 = (number / 10) % 10; // Получаем вторую цифру
            int digit3 = number % 10; // Получаем третью цифру

            // Инвертируем четность/нечетность цифр
            digit1 = (digit1 % 2 == 0) ? digit1 + 1 : digit1 - 1;
            digit2 = (digit2 % 2 == 0) ? digit2 + 1 : digit2 - 1;
            digit3 = (digit3 % 2 == 0) ? digit3 + 1 : digit3 - 1;

            // Формируем и выводим результат в формате "xxx\r\n"
            int result = digit1 * 100 + digit2 * 10 + digit3;
            System.out.printf("%03d%n", result);
        } else {
            System.out.println("Число не является трехзначным");
        }
    }
}

