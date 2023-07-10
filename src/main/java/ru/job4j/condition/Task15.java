package ru.job4j.condition;

/**
 * Задание: Написать код, который увеличивает
 * входящее число вдвое, если оно положительное,
 * и выводит его в консоль.
 * <p>
 * Если число не положительное, его нужно вывести без изменений.
 */
public class Task15 {
    public static void multiplyByTwo(int number) {
        if (number > 0) { //если оно опложит
            int rsl = number * 2; //увеличить вдвое
            System.out.println(rsl); // и на консоль
        } else {
            System.out.println(number);
            //если не положительное, вывести без изменений
        }
    }
}
