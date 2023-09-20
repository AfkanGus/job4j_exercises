package ru.job4j.condition;

/**
 * 79. Определить век по году
 * Ниже представлен метод getCentury(int num), который принимает целое положительное четырехзначное число, определяющее некоторый год в период с 16
 * по 20 века включительно.
 * <p>
 * Задание: Написать код, который определяет и выводит в консоль век, к которому относится входящее число. Если число не относится к указанным
 * векам, вывести - "Не попадает в диапазон".
 * <p>
 * Например, для числа 1876 вывод будет:
 * <p>
 * 19
 * <p>
 * Примечание: любой век длится с XY01 года по X(Y+1)00 год. Например, 16й век шел с 1501 по 1600 года.
 *
 */
public class Task79 {
    public static void getCentury(int num) {
        int century = num / 100;

        if (num % 100 != 0) {
            century++;
        }

        if (century >= 16 && century <= 20) {
            System.out.println(century);
        } else {
            System.out.println("Не попадает в диапазон");
        }
    }
}