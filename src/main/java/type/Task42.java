package type;

/**
 * 42. "Сдвиг вправо по кругу" четырехзначного числа
 * Ниже представлен метод rightCircleShift(int number),
 * который принимает целое положительное четырехзначное число.
 * <p>
 * Задание: Написать код, который выполняет "сдвиг числа вправо по кругу",
 * то есть все цифры числа сдвигаются вправо, а число единиц (последняя
 * цифра) перемещается в старший разряд числа (первая цифра). Результат
 * вывести в консоль.
 * <p>
 * Например, для числа 1234 вывод должен быть:
 * <p>
 * 4123
 * <p>
 * Примечание: в вычислениях нужно пользоваться операторами "вычисление остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
 */
public class Task42 {
    public static void rightCircleShift(int number) {
        int num1 = number % 10;
        int num2 = number / 10;
        System.out.println(num1 * 1000 + num2);
    }
}
