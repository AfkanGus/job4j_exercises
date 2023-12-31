package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Task2Test {
    @Test
    void whenCreateTask2() {
        var task = new Task2();
        assertThat(task, is(notNullValue()));
    }

    @Test
    public void whenCheckVariable() {
        var task = new Task2();
        int x = task.x;
        assertThat(task, is(notNullValue()));
    }
}