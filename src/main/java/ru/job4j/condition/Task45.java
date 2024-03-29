package ru.job4j.condition;

/**
 * 45. Произвести увеличение/уменьшение до ближайшего "круглого" числа
 * Ниже представлен метод changeToRoundNum(int number), который принимает целое положительное число.
 * <p>
 * Задание: Написать код, который изменяет входящее число следующим образом:
 * <p>
 * - Для четного числа - увеличивает его до ближайшего "круглого" и выводит новое значение в консоль в виде
 * "Увеличено до n".
 * <p>
 * - Для нечетного числа - уменьшает его до ближайшего "круглого" и выводит новое значение в консоль в виде
 * "Уменьшено до n".
 * <p>
 * - Если число оканчивается на 0, то есть оно уже "круглое", то вывести в консоль "Без изменений".
 * <p>
 * n - полученное значение после увеличения/уменьшения.
 * <p>
 * Например, вывод для числа 459 будет:
 * <p>
 * Уменьшено до 450
 */
public class Task45 {
    public static void changeToRoundNum(int number) {
        if (number % 10 == 0) {
            System.out.println("Без изменений");
            return;
        }

        int remainder = number % 10; // Остаток от деления на 10

        if (number % 2 == 0) {
            int nearestRound = number + (10 - remainder);
            System.out.println("Увеличено до " + nearestRound);
        } else {
            int nearestRound = number - remainder;
            System.out.println("Уменьшено до " + nearestRound);
        }
    }

    }

