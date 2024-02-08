package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectToListTest {
    @Test
    void test() {
        List<Integer> input = List.of(1, 2);
        List<Integer> expect = List.of(1, 2);
        assertEquals(expect, CollectToList.collect(input.stream()));
    }
}