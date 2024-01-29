package ru.job4j.stream;

import java.util.stream.IntStream;

/**
 * 1.7. Создание стрима примитивов. Методы range() и rangeClosed()
 * Стримы целых чисел (IntStream, LongSteam) имеют также еще один способ создания стрима.
 * Это методы range(int start,
 * int end) и rangeClosed(int start, int end)
 * <p>
 * Первый метод, создает стрим в диапозоне [start, end)
 * <p>
 * Второй метод, создает стрим в диапозоне [start, end]
 * <p>
 * Например,
 * <p>
 * IntStream.range(1, 5) => [1, 2, 3, 4]
 * <p>
 * IntStream.rangeClosed(1, 5) => [1, 2, 3, 4, 5]
 * <p>
 * Ваша задача создать стрим с использованием метода rangeClosed()
 */
public class RangeMethod {
    public static IntStream createStream(int start, int end) {
        return IntStream.rangeClosed(start, end);
    }
}
