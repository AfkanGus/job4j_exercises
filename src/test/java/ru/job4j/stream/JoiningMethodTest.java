package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.StringJoiner;

import static org.junit.Assert.assertEquals;

public class JoiningMethodTest {
    @Test
    void test() {
        StringJoiner expect = new StringJoiner(
                System.lineSeparator(),
                "Prefix",
                "Suffix"
        );
        expect.add("A");
        expect.add("B");
        expect.add("C");
        assertEquals(
                expect.toString(),
                JoiningMethod.join(List.of(
                        "A", "B", "C"
                ))
        );
    }
}