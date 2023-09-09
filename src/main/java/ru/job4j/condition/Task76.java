package ru.job4j.condition;

/**
 * 75. Количество одинаковых цифр в трехзначном числе
 * Ниже представлен метод sameNumAmount(int num), который принимает целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который определяет и выводит в консоль количество одинаковых цифр в этом числе.
 * <p>
 * Например, для числа 331 вывод будет:
 * <p>
 * 2
 */
public class Task76 {
    public static void sameNumAmount(int num) {
        String strNum = Integer.toString(num);
        int count = 0;

        for (int i = 0; i < strNum.length(); i++) {
            char currentChar = strNum.charAt(i);
            int charCount = 0;

            for (int j = 0; j < strNum.length(); j++) {
                if (strNum.charAt(j) == currentChar) {
                    charCount++;
                }
            }

            if (charCount > 1) {
                count++;
                // Чтобы избежать дублирования одинаковых цифр, заменяем их на символ, который не встречается в числе.
                strNum = strNum.replace(currentChar, ' ');
            }
        }

        System.out.println(count);
    }
}
