package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FreezeStrTest {
    @Test
    void whenEq() {
        assertThat(FreezeStr.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(FreezeStr.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(FreezeStr.eq("heloo", "hello"), is(false));
    }
}