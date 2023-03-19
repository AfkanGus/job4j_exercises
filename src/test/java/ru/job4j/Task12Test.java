package ru.job4j;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

public class Task12Test {
    @Test
    public void checkoutTask12() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task12.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()).add("Ping").
                add("Pong").toString();
        assertThat(out.toString(), is(expected));
    }
}