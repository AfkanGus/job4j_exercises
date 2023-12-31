package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Task7Test {
    @Test
    void whenCheckConstructor() {
        var task = new Task7(1, 2);
        assertThat(task, is(notNullValue()));
    }

    @Test
    void whenCheckGetters() {
        var task = new Task7(1, 2);
        List<Integer> list = new ArrayList<>();
        list.add(task.getFirst());
        list.add(task.getSecond());
        assertEquals(list, List.of(1, 2));
    }
}