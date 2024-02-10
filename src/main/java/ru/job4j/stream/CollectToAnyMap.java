package ru.job4j.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 3.4. Сборка элементов. Сборка в произвольную реализацию Map
 * Ранее мы сталкивались с реализацией toMap с тремя аргументами. Этот метод
 * перегружен и имеет реализацию с четырьмя аргументами, где в качестве
 * четвертого аргумента мы можем указать реализацию Map, которую мы хотим получить
 * <p>
 * Например
 * <p>
 * Map<Integer, Integer> map = List.of(1, 2, 1).stream().collect(Collectors.toMap(k -> k, v -> v, (prev, curr) -> prev, TreeMap::new));
 * <p>
 * В данном случае мы получим реализацию Map, но только TreeMap.
 * <p>
 * Ваша задача собрать Map из стрима чисел, где ключ это само число, а значение его квадрат. Сборка должна быть в LinkedHashMap
 */
public class CollectToAnyMap {
    public static Map<Integer, Integer> collect(Stream<Integer> data) {
        return data.collect(Collectors.toMap(k -> k, v -> v * v, (prev, curr) -> prev, LinkedHashMap::new));
    }
}
