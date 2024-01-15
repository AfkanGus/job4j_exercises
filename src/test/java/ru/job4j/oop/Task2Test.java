package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Task2Test {
    @Test
    public void checkMainOutput() {
        var methods = Task2.class.getDeclaredMethods();
        assertThat(methods.length, is(1));
        assertThat(methods[0].getName(), is("happyXmas"));
    }
}