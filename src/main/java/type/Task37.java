package type;

/**
 * 37. "Линейный сдвиг влево" трехзначного числа
 * Ниже представлен метод leftShift(int number),
 * который принимает целое положительное трехзначное число.
 * <p>
 * Задание: Написать код, который выполняет
 * "линейный сдвиг числа влево", то есть цифры
 * числа перемещаются на одну позицию влево
 * (единицы - на место десятков, десятки - на место
 * сотен и тд), при этом первая цифра удаляется из числа,
 * а на место единиц записывается ноль. Результат вывести
 * в консоль.
 * <p>
 * Например, для числа 123 вывод должен быть:
 * <p>
 * 230
 * <p>
 * Примечание: в вычислениях нужно пользоваться
 * операторами "вычисление остатка"(%), "вычисление
 * частного"(/) и базовыми арифметическими операциями.
 */
public class Task37 {
    public static void leftShift(int number) {
        int shiftedNumber = number % 100 * 10;
        System.out.println(shiftedNumber);
    }
}
