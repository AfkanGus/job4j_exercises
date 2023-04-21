package ru.job4j.iterator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class FlapMapTest {
    @Test
    public void whenDiffNext() {
        Iterator<Iterator<Integer>> data = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();
        FlapMap<Integer> flap = new FlapMap<>(data);
        assertThat(flap.next()).isEqualTo(1);
        assertThat(flap.next()).isEqualTo(2);
        assertThat(flap.next()).isEqualTo(3);
    }
}