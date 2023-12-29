package ru.job4j.exam.collections.generics.string;

/**
 * 2. Число-палиндром.
 */
public class Task174 {
    public static void isPalindrome(int number) {
        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reversed) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
