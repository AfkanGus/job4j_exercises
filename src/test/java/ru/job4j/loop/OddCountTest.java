package ru.job4j.loop;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddCountTest {
    @Test
    public void test() {
        assertEquals(1, OddCount.count(1, 2));
        assertEquals(2, OddCount.count(1, 3));
        assertEquals(2, OddCount.count(1, 4));
        assertEquals(3, OddCount.count(1, 5));
    }
}