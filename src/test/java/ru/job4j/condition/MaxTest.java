package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int rsl = Max.max(left, right);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int rsl = Max.max(left, right);
        int expected = 2;
        assertThat(rsl).isEqualTo(expected);
    }
}