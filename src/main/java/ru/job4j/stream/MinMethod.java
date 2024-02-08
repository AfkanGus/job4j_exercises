package ru.job4j.stream;

import java.util.List;
import java.util.Optional;

/**
 * 2.4. Понятие редукции. Метод min(). Поиск кратчайшей строки
 * Как вы наверное уже догадались поиск минимального элемента представляет собой также редукцию. Этот метод принимает Comparator и возвращает
 * Optional. Если список пуст вернется пустой Optional.
 * <p>
 * Пример,
 * <p>
 * Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
 * <p>
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 */
public class MinMethod {
    public static String min(List<String> list) {
        // 1.Способ return list.stream().min((s1, s2) -> Integer.compare(s1.length(), s2.length())).get();
        //2. Способ return list.stream().min(Comparator.comparing(String::length)).get();
        /*3. Способ*/
        Optional<String> minString = list.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        return minString.orElse("Список пуст");

    }

}
