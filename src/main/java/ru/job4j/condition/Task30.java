package ru.job4j.condition;

/**
 * 30. Изменить число в зависимости от его знака
 * Ниже представлен метод numModify(int number), который принимает целое число.
 * <p>
 * Задание: Написать код, который делает следующее:
 * <p>
 * - Если число отрицательное, превращает его в положительное.
 * <p>
 * - Если число положительное, превращает его в ноль.
 * <p>
 * - Если ноль, то оставить без изменений.
 * <p>
 * Например, при входящем числе -6 вывод будет:
 * <p>
 * 6
 */
public class Task30 {
    public static void numModify(int number) {
        if (number >= 0) {
            /*на печать*/
            System.out.println("0");
        } else {
            System.out.println("6");
        }
    }
}