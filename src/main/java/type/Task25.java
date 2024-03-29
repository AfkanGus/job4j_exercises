package type;

/**
 * 25. Вывести трехзначное число в "полном виде"
 * Ниже представлен метод separate(int number), который принимает целое
 * положительное трехзначное число.
 *
 * Задание: Вывести входящее число в консоль в одну строку в "полном виде",
 * то есть в виде "сотни+десятки+единицы".
 *
 * Например, для числа 345 вывод должен быть:
 *
 * 300+40+5
 *
 * Примечание: для вычислений можно пользоваться только операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и базовыми
 * арифметическими операциями.
 */
public class Task25 {
    public static void separate(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number / 10 % 10 * 10;
        num3 = number % 10;
        System.out.println(num1 + "00+" + num2 + "+" + num3);

    }
}
