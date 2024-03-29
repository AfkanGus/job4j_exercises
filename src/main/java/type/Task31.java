package type;

/**
 * 31. Скомбинировать значение из цифр трехзначного числа
 * Ниже представлен метод difference(int number), который принимает целое
 * положительное трехзначное число.
 * <p>
 * Задание: Написать код, который высчитывает разницу между его первой (число
 * сотен) и последней (число единиц) цифрой входящего трехзначного числа,
 * умноженную на его среднюю (число десятков) цифру, и выводит результат в
 * консоль.
 * <p>
 * Например, для числа 235 вывод должен быть (2 - 5) * 3:
 * <p>
 * 9
 * <p>
 * Примечание: в вычислениях нужно пользоваться операторами "вычисление
 * остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
 * <p>
 * Разницу нужно выводить в виде модуля этого числа с помощью Math.abs().
 */
public class Task31 {
    public static void difference(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = (number % 100) / 10;
        num3 = (number % 100) % 10;
        System.out.println(Math.abs(num3 - num1) * num2);
    }
}
