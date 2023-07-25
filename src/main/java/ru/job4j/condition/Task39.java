package ru.job4j.condition;

/**
 * 38. Проверить симметричность трехзначного числа
 * Ниже представлен метод isSymmetric(int number), который принимает
 * целое трехзначное положительное число.
 * <p>
 * Трехзначное число является симметричным, если первая и последняя его
 * цифры одинаковы.
 * <p>
 * Задание: Написать код, который проверяет,
 * является ли входящее число симметричным. Если является - вывести "Да", если нет - "Нет".
 * <p>
 * Например, вывод для числа 363 будет:
 * <p>
 * Да
 */
public class Task39 {
    public static void isSymmetric(int number) {
        String numStr = String.valueOf(number);
        char[] numChar = numStr.toCharArray();
        char firstDigit = numChar[0];
        char lastDigit = numChar[2];
        for (int i = 1; i < numChar.length; i++) {
            if (firstDigit == lastDigit) {
                System.out.println("Да");
                break;
            } else {
                System.out.println("Нет");
                break;
            }

        }
    }
}
