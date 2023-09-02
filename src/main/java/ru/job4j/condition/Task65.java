package ru.job4j.condition;

/**
 * 65. Вывести время года по номеру месяца
 * Ниже представлен метод season(int number), который принимает целое число, которое должно соответствовать одному из
 * порядковых номеров месяцев.
 * <p>
 * Задание: Написать код, который выводит в консоль время года, к которому относится этот месяц ("Весна", "Лето",
 * "Осень", "Зима"). Если входящее число не соответствует какому-либо месяцу - вывести "Не является месяцем".
 * <p>
 * Например, для числа 9 вывод будет:
 * <p>
 * Осень
 */
public class Task65 {
    public static void season(int number) {
        switch (number) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не является месяцем");
                break;
        }
    }
}
