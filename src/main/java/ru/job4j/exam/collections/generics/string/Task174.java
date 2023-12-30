package ru.job4j.exam.collections.generics.string;

/**
 * 2. Число-палиндром.
 */
public class Task174 {
    public static void isPalindrome(int number) {
        int reversed = 0;
        int originalNumber = number;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversed || originalNumber == reversed / 10) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
