package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class Task9Test {

    @Test
    public void whenCreateQueue() {
        Task9 task = new Task9();
        assertEquals(task.queue.getClass(), PriorityQueue.class);
    }
}