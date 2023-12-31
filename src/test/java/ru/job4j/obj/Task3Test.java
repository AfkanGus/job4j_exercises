package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Task3Test {
    @Test
    void whenCreateTask3() {
        var task = new Task3();
        assertThat(task, is(notNullValue()));
    }

    @Test
    void whenCheckVariable() {
        var task = new Task3();
        int x = task.x;
        assertThat(task, is(notNullValue()));
    }

    @Test
    void whenMethodInvoke() {
        var task = new Task3();
        int x = task.getX();
        assertThat(x, is(3));
    }
}