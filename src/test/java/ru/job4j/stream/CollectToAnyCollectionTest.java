package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectToAnyCollectionTest {
    @Test
    void test() {
        List<Integer> data = List.of();
        String expectClass = "java.util.LinkedHashSet";
        String resultClass = CollectToAnyCollection.collect(data.stream()).getClass().getName();
        assertEquals(expectClass, resultClass);
    }
}