package type;

/**
 * 39. "Сдвиг влево по кругу" трехзначного числа.
 * Задание: Написать код, который выполняет "сдвиг цифр числа влево по кругу",
 * то есть цифры числа перемещаются на одну позицию влево (единицы - на
 * место десятков, десятки - на место сотен и тд), при этом первая цифра
 * перемещается на место единиц (становится последней). Результат вывести в
 * консоль.
 * <p>
 * Например, для числа 123 вывод должен быть:
 * <p>
 * 231
 * <p>
 * Примечание: в вычислениях нужно пользоваться операторами "вычисление
 * остатка"(%), "вычисление частного"(/) и базовыми арифметическими операциями.
 */
public class Task39 {
    public static void leftCircleShift(int number) {
        /*ы получить первые две цифры числа*/
        int num1 = number / 100;
        /*ы получить последние две цифры числа. сдвинуть его влево на одну позицию
         (умножение на 10 эквивалентно умножению на 10^1)*/
        int num2 = (number % 100) * 10;
        /*получить итоговое число после сдвига цифр*/
       int num3 = num1 + num2;
        System.out.println(num3);
    }
}
