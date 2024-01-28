package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class StreamBuilderTest {
    @Test
    void test() {
        Integer[] data = {1, 2, 3};
        Stream<Object> stream = StreamBuilder.createStream(data);
        List<Integer> list = stream.map(v -> (Integer) v).collect(Collectors.toList());
        List<Integer> expect = List.of(1, 3);
        assertEquals(expect, list);

    }
}