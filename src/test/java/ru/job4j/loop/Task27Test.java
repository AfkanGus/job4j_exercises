package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task27Test {
    public String ln = System.lineSeparator();

    @Test
    public void when2ThenMinus1And0And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task27.loop(2);
        String expected = "-1 0 1" + ln;
        assertThat(out.toString(), is(expected));
    }
}