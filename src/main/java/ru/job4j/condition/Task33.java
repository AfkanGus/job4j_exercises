package ru.job4j.condition;

/**
 * 33. Найти количество четных цифр в трехзначном числе
 * Ниже представлен метод evenAmount(int number),
 * который принимает целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который высчитывает количество
 * четных цифр во входящем трехзначном числе, и выводит результат в консоль.
 * <p>
 * Переменная counter - это счетчик наших четных цифр.
 * <p>
 * Например, для числа 650 вывод должен быть:
 * <p>
 * 2
 * <p>
 * Примечание: в вычислениях нужно пользоваться операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и
 * базовыми арифметическими операциями.
 */
public class Task33 {
    public static void evenAmount(int number) {
        int num1, num2, num3, counter = 0;
        num1 = number % 10;         // последняя цифра
        num2 = (number / 10) % 10;  // средняя цифра
        num3 = number / 100;        // первая цифра
        if (num1 % 2 == 0) {
            counter++;
        }
        if (num2 % 2 == 0) {
            counter++;
        }
        if (num3 % 2 == 0) {
            counter++;
        }
        /* if (number % 10 % 2 == 0) {
            counter++;
        }
        if (number / 10 % 10 % 2 == 0) {
            counter++;
        }
        if (number / 100 % 2 == 0) {
            counter++;
        }*/
        System.out.println(counter);
    }
}