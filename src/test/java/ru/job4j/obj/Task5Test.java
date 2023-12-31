package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

public class Task5Test {
    @Test
    void whenCreateTask5() {
        Class<Task5> task = Task5.class;
        assertTrue(task.isRecord());
    }
}