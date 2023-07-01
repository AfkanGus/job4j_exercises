package type;

/**
 * 34. Найти количество четных цифр в четырехзначном числе.
 * Ниже представлен метод evenAmount(int number),
 * который принимает целое положительное четырехзначное число.
 * Задание: Написать код, который высчитывает количество четных
 * цифр во входящем четырехзначном числе, и выводит результат в консоль.
 * Переменная counter - это счетчик наших четных цифр.
 * <p>
 * Например, для числа 4012 вывод должен быть:
 * <p>
 * 3
 * Примечание: в вычислениях нужно пользоваться операторами
 * "вычисление остатка"(%), "вычисление частного"(/) и
 * базовыми арифметическими операциями.
 */
public class Task34 {
    public static void evenAmount(int number) {
        String numberStr = Integer.toString(number);
        int counter = 0;
        //перебор символов строки
        for (int i = 0; i < numberStr.length(); i++) {
            //получим все символы
            char charStr = numberStr.charAt(i);
            // переведем обрато символы в число
           // int digit = Character.getNumericValue(charStr);
            if (charStr % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
