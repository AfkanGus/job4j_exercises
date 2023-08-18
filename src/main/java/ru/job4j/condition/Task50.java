package ru.job4j.condition;

/**
 * 50. Наибольшая последняя цифра среди двух чисел
 * Ниже представлен метод maxLastDigit(int num1, int num2), который принимает 2 целых положительных числа.
 * <p>
 * Задание: Написать код, который выводит в консоль наибольшую из последних цифр этих двух чисел. Если последние
 * цифры одинаковы, то вывести - "Одинаковые".
 * <p>
 * Например, вывод для чисел 252 и 76 будет:
 * <p>
 * 6
 */
public class Task50 {
    public static void maxLastDigit(int num1, int num2) {
        int lastDigit1 = num1 % 10;  /*Получение последней цифры числа num1*/
        int lastDigit2 = num2 % 10; /*Получение последней цифры числа num2*/

        int[] lastDigits = {lastDigit1, lastDigit2};

        int maxLastDigit = lastDigits[0];

        for (int i = 1; i < lastDigits.length; i++) {
            maxLastDigit = Math.max(maxLastDigit, lastDigits[i]);
        }

        if (lastDigit1 == lastDigit2) {
            System.out.println("Одинаковые");
        } else {
            System.out.println(maxLastDigit);
        }
/*
        int maxLastDigit = Math.max(lastDigit1, lastDigit2);
        if (lastDigit1 == lastDigit2) {
            System.out.println("Одинаковые");
        } else {
            System.out.println(maxLastDigit);
        }*/

       /* String rsl = (lastDigit1 > lastDigit2) ? String.valueOf(lastDigit1) : (lastDigit1 < lastDigit2)
                ? String.valueOf(lastDigit2) : "Одинаковые";
        System.out.println(rsl);*/

       /* if (lastDigit1 > lastDigit2) {
            System.out.println(lastDigit1);
        } else if (lastDigit1 < lastDigit2) {
            System.out.println(lastDigit2);
        } else {
            System.out.println("Одинаковые");
        }*/
    }
}
