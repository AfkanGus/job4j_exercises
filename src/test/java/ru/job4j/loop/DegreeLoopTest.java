package ru.job4j.loop;

import static org.junit.Assert.*;

import org.junit.Test;

public class DegreeLoopTest {
    @Test
    public void test() {
        assertEquals(4, DegreeLoop.calculate(2, 2));
        assertEquals(9, DegreeLoop.calculate(3, 2));
        assertEquals(3, DegreeLoop.calculate(3, 1));
        assertEquals(128, DegreeLoop.calculate(2, 7));
    }
}