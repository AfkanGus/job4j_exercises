package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class Task4Test {
    @Test
    public void whenCreateTask4() {
        Class<Task4> task = Task4.class;
        assertTrue(task.isEnum());
    }
}