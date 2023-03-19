package ru.job4j;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task13Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String input = String.format("%f %f", 1.0, 0.1);
        System.setIn(new ByteArrayInputStream(
                input.getBytes()
        ));
        System.setOut(new PrintStream(out));
        Task13.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        )
                .add("1.1")
                .add("0.9")
                .add("0.1")
                .add("10.0")
                .toString();
        assertThat(out.toString(), is(expected));
    }
}