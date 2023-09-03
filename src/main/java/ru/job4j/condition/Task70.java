package ru.job4j.condition;

/**
 * 70. Преобразовать секунды в минуты
 * Ниже представлен метод secondsToMinutes(int seconds), который принимает целое число - промежуток времени,
 * выраженный в секундах.
 * <p>
 * Задание: Написать код, который переводит этот промежуток времени в промежуток, выраженный минутами и секундами.
 * Результат вывести в консоль в виде "Минут: x, секунд: y", где x - минуты, y - секунды. Если входящий промежуток
 * времени превышает один час, то вывести "Расчет не производится".
 * <p>
 * Например, для числа 65 вывод будет:
 * <p>
 * Минут: 1, секунд: 5
 */
public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println("Минут: " + minutes + ", секунд: " + remainingSeconds);
        }
    }
}
