package ru.job4j.loop;

/**
 * 35. Вывести предшествующие числа
 * ниже представлен метод loop(int num), который принимает целое число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел 5
 * предшествующих входящему числу чисел (в убывающем
 * порядке), причем разница между значениями этих чисел должна быть равна 6.
 * <p>
 * Примечание: для сборки результирующей строки с выводом значений
 * через пробел нужно использовать StringJoiner.
 * <p>
 * Например, для числа 10 вывод будет:
 * <p>
 * 4 -2 -8 -14 -20
 */
public class Task35 {
    public static void loop(int num) {
        StringBuilder str = new StringBuilder();
        int count = 0;
        int input = num;
        int number = input - 6;
        while (count < 5) {
            if (number != 0) {
                str.append(number).append(" ");
                count++;
                number -= 6;
            }
        }
        System.out.println(str.toString().trim());
    }
}
