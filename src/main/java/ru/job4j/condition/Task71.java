package ru.job4j.condition;

/**
 * 71. Минимальный набор купюр
 * Ниже представлен метод change(int money), который принимает целое число - сумму в рублях, которую нужно выплатить.
 * <p>
 * В кассе есть купюры достоинством 100, 50 и 10 рублей.
 * <p>
 * Задание: Написать код, который определяет, каким минимальным набором купюр можно выдать данную сумму. Результат вывести в консоль в виде: "100:
 * x, 50: y, 10: z", где x, y, z - количество соответствующих купюр к выдаче. Если сумму нельзя выдать полностью (Например, 156) - вывести "Нельзя".
 * <p>
 * Например, для числа 170, вывод будет:
 * <p>
 * 100: 1, 50: 1, 10: 2
 */
public class Task71 {
    public static void change(int money) {
        int hundredBills = 0;
        int fiftyBills = 0;
        int tenBills = 0;

        while (money >= 100) {
            hundredBills++;
            money -= 100;
        }

        while (money >= 50) {
            fiftyBills++;
            money -= 50;
        }

        while (money >= 10) {
            tenBills++;
            money -= 10;
        }

        if (money == 0) {
            System.out.println("100: " + hundredBills + ", 50: " + fiftyBills + ", 10: " + tenBills);
        } else {
            System.out.println("Нельзя");
        }
    }
}
