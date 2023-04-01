package ru.job4j;

/**
 * 16. Вывод на консоль надписи "+++!!!!??" (2)
 * Дана строка
 * +!?
 * Напишите класс, который выводит на экран последовательно три знака «+»,
 * четыре знака «!», два знака «?».
 */
public class Task16 {
    public static void main(String[] args) {
        String source = "+!?";
        System.out.print(source.charAt(0));
        System.out.print(source.charAt(0));
        System.out.print(source.charAt(0));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(2));
        System.out.print(source.charAt(2));

    }
}
