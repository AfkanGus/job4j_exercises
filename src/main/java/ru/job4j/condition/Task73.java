package ru.job4j.condition;

/**
 * 73. Является ли средняя цифра трехзначного числа меньше остальных
 * Ниже представлен метод midDigitLess(int num), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который определяет, является ли средняя цифра этого числа меньше остальных.
 * Вывести в консоль "Да", если является, и
 * "Нет", если не является.
 * <p>
 * Например, для числа 426 вывод будет:
 * <p>
 * Да
 */
public class Task73 {
    public static void midDigitLess(int num) {
        int firstNumber = (num / 100);
        int lastNumber = num % 10;
        int middleNumber = (num / 10) % 10;
        System.out.println((middleNumber < lastNumber && middleNumber < firstNumber) ? "Да" : "Нет");
      /*  if (middleNumber < lastNumber && middleNumber < firstNumber) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }*/
    }
}
