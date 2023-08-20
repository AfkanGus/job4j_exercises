package ru.job4j.condition;

/**
 * 53. Преобразовать трехзначное число в зависимости от условия
 * Ниже представлен метод transform(int number), который принимает целое трехзначное число.
 * <p>
 * Задание: Написать код, который выполняет следующее:
 * <p>
 * - Если число четное - все четные цифры этого числа увеличиваются на 1, а нечетные - уменьшаются на 1. Если
 * увеличение/уменьшение невозможно (например, увеличить 9), то оставить эту цифру без изменения.
 * <p>
 * - Если число нечетное, то все изменения произвести наоборот - четные цифры уменьшить на 1, нечетные - увеличить на 1.
 * <p>
 * Получившееся число вывести в консоль.
 * <p>
 * Например, для числа 309 вывод будет:
 * <p>
 * 409
 */
public class Task54 {
    public static void transform(int number) {
        // Преобразование числа в строку для удобства обработки цифр
        String numStr = Integer.toString(number);
        StringBuilder result = new StringBuilder();

        // Проходимся по каждой цифре числа
        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);

            // Проверяем, четная ли цифра
            boolean isEven = (digit - '0') % 2 == 0;

            // Выполняем соответствующее преобразование
            if (isEven) {
                if (digit == '9') {
                    result.append(digit); // Нельзя увеличить 9
                } else {
                    result.append((char) (digit + 1));
                }
            } else {
                if (digit == '0') {
                    result.append(digit); // Нельзя уменьшить 0
                } else {
                    result.append((char) (digit - 1));
                }
            }
        }

        // Выводим результат
        System.out.println(result.toString());
    }
}
