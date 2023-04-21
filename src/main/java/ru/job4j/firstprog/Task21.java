package ru.job4j.firstprog;

/**
 * 21. Вывод текста из нескольких строк в рамке из "звёздочек".
 * Напишите класс, который выводит на экран в одной строке ваше фамилию,
 * имя, отчество , в другой ― телефон, все это ― в рамке из «звездочек».
 */
public class Task21 {
    public static void main(String[] args) {
        String fullName = " Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        System.out.println("************************");
        System.out.println("*" + fullName + " *");
        System.out.println("* " + phoneNumber + "    *");
        System.out.print("************************");
    }
}
