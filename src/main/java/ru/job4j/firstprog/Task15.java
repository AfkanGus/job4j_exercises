package ru.job4j.firstprog;

/**
 * 15. Вывод на консоль надписи "+++!!!!??" (1)
 * Дана строка +!?
 * Напишите класс, который выводит на экран в первой строке три знака «+»,
 * во второй ― четыре знака «!», в третьей ― два знака «?».
 */
public class Task15 {
    public static void main(String[] args) {
        String source = "+!?";
        System.out.print(source.charAt(0));
        System.out.print(source.charAt(0));
        System.out.println(source.charAt(0));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(1));
        System.out.print(source.charAt(1));
        System.out.println(source.charAt(1));
        System.out.print(source.charAt(2));
        System.out.print(source.charAt(2));
    }
}
