package type;

/**
 * 29. Посчитать сумму цифр трехзначного числа
 * Ниже представлен метод numSum(int number), который принимает целое
 * положительное трехзначное число.
 *
 * Задание: Написать код, который высчитывает сумму цифр данного числа, и
 * выводит результат в консоль.
 *
 * Например, для числа 325 вывод должен быть:
 *
 * 10
 *
 * Примечание: для вычислений можно пользоваться только операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и базовыми
 * арифметическими операциями.
 */
public class Task29 {
    public static void numSum(int number) {
        int num1 = number % 10;
        int num2 = (number / 10) % 10;
        int num3 = number / 100;
        System.out.println(num1 + num2 + num3);
    }
}
