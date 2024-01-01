package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Task11Test {
    @Test
    void whenCreateDeque() {
        Task11 task = new Task11();
        assertEquals(task.deque.getClass(), LinkedList.class);
    }

    @Test
    void whenCheckDeque() {
        Task11 task = new Task11();
        task.init();
        List<Integer> list = new ArrayList<>();
        Deque<Integer> deque = task.deque;
        list.add(deque.pollLast());
        list.add(deque.pollLast());
        list.add(deque.pollLast());
        assertEquals(list, List.of(1, 2, 3));
    }
}