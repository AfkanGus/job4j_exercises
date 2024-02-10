package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 3.5. Сборка элементов. Сборка в строку
 * Для сборки текста мы использовали StringJoiner, или StringBuilder. Стримы также позволяют сложить элементы, если они являются строками, в единый
 * текст. Для этого используется метод collect() и Collectors.joining(). Метод joining() принимает те же аргументы, что и StringJoiner
 * <p>
 * Пример,
 * <p>
 * List.of("A", "B", "C").stream().collect(Collectors.joining(System.lineSeparator()));
 * <p>
 * Получим
 * <p>
 * A
 * <p>
 * B
 * <p>
 * C
 * <p>
 * Ваша задача собрать строки списка в текст и добавить префикс "Prefix", и суффикc "Suffix"(т.е. нужно использовать перегруженный вариант joining
 * ()). Разделителем должен быть System.lineSeparator()
 */
public class JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
