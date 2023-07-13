package ru.job4j.condition;

/**
 * Ниже представлен метод sumOrMultiply(int number1, int number2),
 * который принимает 2 целых числа.
 * <p>
 * Задание: Написать код, который выводит на экран сумму этих чисел
 * , если первое больше второго, если же наоборот - выводит их произведение.
 * <p>
 * В случае, если числа одинаковы, вывести сообщение "Числа равны".
 */
public class Task19 {
    public static void sumOrMultiply(int number1, int number2) {
        if (number1 > number2) {
            int rsl = number1 + number2;
            System.out.println(rsl);

        } else if (number2 == number1) {
            System.out.println("Числа равны");
        } else {
            System.out.println(number1 * number2);
        }
    }
}
