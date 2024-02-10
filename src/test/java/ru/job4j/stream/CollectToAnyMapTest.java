package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectToAnyMapTest {
    @Test
    void testContent() {
        List<Integer> data = List.of(2, 3, 3);
        Map<Integer, Integer> expect = Map.of(
                2, 4,
                3, 9
        );
        Map<Integer, Integer> rsl = CollectToAnyMap.collect(data.stream());
        assertEquals(expect, rsl);
    }

    @Test
    public void testClassName() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashMap";
        String resultClass = CollectToAnyMap.collect(data.stream()).getClass().getName();
        assertEquals(expectClass, resultClass);
    }
}