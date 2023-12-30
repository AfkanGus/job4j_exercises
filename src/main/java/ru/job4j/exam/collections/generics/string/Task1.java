package ru.job4j.exam.collections.generics.string;

/**
 * 3. Наибольшее совпадение в строке.
 */
public class Task1 {
    public static String maxMatch(String[] strings) {
        if (strings == null || strings.length == 0) {
            return ""; // Возвращаем пустую строку для пустого массива или null
        }

        // Инициализируем переменную для хранения результата
        String result = strings[0];

        // Перебираем остальные строки массива
        for (int i = 1; i < strings.length; i++) {
            // Поиск текущей строки в текущей result
            while (strings[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);

                // Если result стало пустой строкой, значит не найдено совпадение
                if (result.isEmpty()) {
                    return "";
                }
            }
        }

        return result;
    }
}
