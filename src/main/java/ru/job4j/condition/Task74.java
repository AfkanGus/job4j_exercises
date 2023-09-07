package ru.job4j.condition;

/**
 * 74. Определить "внутреннее" число
 * Ниже представлен метод innerNum(int num2, int num4), который принимает 2 целых числа - num2 - двузначное, num4 - четырехзначное.
 * <p>
 * Задание: Написать код, который определяет, является ли двузначное число "внутренним" по отношению к четырехзначному. То есть какая-то пара
 * смежных цифр в четырехзначном числе образует входящее двузначное число. Вывести в консоль "Да", если является, и "Нет", если не является.
 * <p>
 * Например, для чисел 24 и 1524 вывод будет:
 * <p>
 * Да
 */
public class Task74 {
    public static void innerNum(int num2, int num4) {
        String strNum4 = Integer.toString(num4);
        String strNum2 = Integer.toString(num2);

        if (strNum4.contains(strNum2)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
