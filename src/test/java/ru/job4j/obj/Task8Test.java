package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class Task8Test {
    @Test
    void whenCreateTask8() {
        Class<Task8> task = Task8.class;
        assertTrue(task.isInterface());
    }
}