package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * 1.2. Создание стрима из последовательности. Метод Stream.of().
 * Иногда у нас есть последовательность и мы хотим создать стрим из этой последовательности.
 * Для этого мы можем
 * использовать метод Stream.of(T...)
 * <p>
 * Например,
 * <p>
 * Stream.of(1, 2, 3)
 * <p>
 * Ниже приведен код, создайте стрим из символов 'a', 'b', 'c'
 */
public class StreamOfMethod {
    public static Stream<Character> createStream() {
        return Stream.of('a', 'b', 'c');
    }
}
