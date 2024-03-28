package ru.job4j;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class ConvMarx2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvMarx2List list = new ConvMarx2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expected = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result).containsAll(expected);
    }
}