package type;

/**
 * 26. Трансформировать двузначное число
 * Ниже представлен метод transform(int number), который принимает целое
 * положительное двузначное число.
 *
 * Задание: Построить новое значение, составленное из цифр входящего числа,
 * но в обратном порядке. Полученное значение нужно увеличить на 8 и вывести
 * в консоль.
 *
 * Например, для числа 37 нужно построить число 73, и вывести на экран 81.
 *
 * Примечание: для вычислений можно пользоваться только операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и базовыми
 * арифметическими операциями.
 */
public class Task26 {
    public static void transform(int number) {
        int num1, num2;
        num1 = (number % 10);
        num2 = (number) / 10;
        System.out.println(num1 * 10 + num2);
    }
}