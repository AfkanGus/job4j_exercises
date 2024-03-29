package type;

/**
 * Задание: Написать код, который обменивает правые цифры
 * этих чисел между собой. Результат вывести в консоль построчно.
 *
 * Например, для чисел 123 и 456 вывод должен быть:
 *
 * 126
 *
 * 453
 *
 * Примечание: в вычислениях нужно пользоваться операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и
 * базовыми арифметическими операциями.
 */
public class Task43 {
    public static void rightNumChange(int number1, int number2) {
        /* / на 10, что приводит к удалению последней цифры.
        * умножаем на 10, чтобы сдвинуть его влево на одну позицию.
        * number2 % 10 возвращает остаток от деления числа number2 на 10,
        *  что дает нам последнюю цифру number2.
        * Сложение этих двух значений позволяет объединить
        *  сдвинутое число number1 с последней цифрой number2*/
        int num1 = number1 / 10 * 10 + number2 % 10;
        /* / на 10, что приводит к удалению последней цифры.
        *  *на 10, чтобы сдвинуть его влево на одну позицию.
        * number1 % 10 возвращает остаток от деления числа number1
        *  на 10, что дает нам последнюю цифру number1.
        * Сложение этих двух значений позволяет объединить
        * сдвинутое число number2 с последней цифрой number1 */
        int num2 = number2 / 10 * 10 + number1 % 10;
        /**/
        System.out.println(num1);
        System.out.println(num2);
    }
}
