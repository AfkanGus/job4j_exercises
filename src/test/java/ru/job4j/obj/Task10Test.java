package ru.job4j.obj;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
public class Task10Test {

    @Test
    public void whenCreateDeque() {
        Task10 task = new Task10();
        assertEquals(task.deque.getClass(), LinkedList.class);
    }

    @Test
    public void whenCheckDeque() {
        Task10 task = new Task10();
        task.deque.addFirst("text");
        assertEquals(task.deque.getFirst(), "text");
    }
}