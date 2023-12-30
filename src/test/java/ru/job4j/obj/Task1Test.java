package ru.job4j.obj;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

public class Task1Test {
    @Test
    void whenCreateTask1() {
        var task = new Task1();
        assertThat(task, is(notNullValue()));
    }
}