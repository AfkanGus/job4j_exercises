package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 1.6. Создание стрима примитивов. Метод Arrays.stream()
 * Класс Stream работает с объектами. Для представления стрима примитивов в
 * Java есть свои классы: IntStream,
 * LongStream, DoubleStream.
 * <p>
 * Их можно создавать как мы создавали раньше. Чаще всего приходиться создавать
 * стрим из массива примитивов. Для
 * этого лучше всего подходит метод Arrays.stream(). Например
 * <p>
 * int[] data = {1, 2, 3};
 * <p>
 * IntStream steam = Arrays.stream(data);
 * <p>
 * Ваша задача создать стрим из переданного массива
 */
public class ArraysStreamForPrimitive {
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
