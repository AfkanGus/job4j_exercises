package type;

/**
 * 35. Выполнить перестановку первой и последней цифры трехзначного числа
 * Ниже представлен метод firstLastChange(int number), который принимает
 * целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который выполняет перестановку первой и последней
 * цифры входящего трехзначного числа, и выводит результат в консоль.
 * <p>
 * Например, для числа 125 вывод должен быть:
 * <p>
 * 521
 * <p>
 * Примечание: в вычислениях нужно пользоваться операторами "вычисление
 * остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
 */
public class Task35 {
    public static void firstLastChange(int number) {
        int num1, num2, num3;
        num1 = number / 100; //вычисляем сотые
        num2 = (number / 10) % 10; //вычисляем десятки после сотки
        num3 = number % 10; //вычисляем последнее единицы
        int result = num3 * 100 + num2 * 10 + num1;
        System.out.println(result);
        // System.out.println(num1 + "" + num2 + "" + num3);
    }
}
