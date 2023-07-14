package ru.job4j.condition;

/**
 * 25. Является ли число положительным
 * Ниже представлен метод isPositive(int number),
 * который принимает целое число.
 * <p>
 * Задание: Написать код, который выводит в консоль
 * "Да", если число положительное, иначе "Нет".
 */
public class Task25 {
    public static void isPositive(int number) {
        String[] str = {"Да", "Нет"};
        int rsl = number > 0 ? 0 : 1;
        System.out.println(str[rsl]);
    }
}
