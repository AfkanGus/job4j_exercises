package ru.job4j.condition;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task44Test {
    public String ln = System.lineSeparator();

    @Test
    public void when553Then550() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(553);
        String expected = "550" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when57Then60() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(57);
        String expected = "60" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5501Then5500() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(5501);
        String expected = "5500" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when53530Then53530() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(53530);
        String expected = "53530" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when4Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(4);
        String expected = "0" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when9Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(9);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }

    @Test
    public void when5Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.getRoundNumber(5);
        String expected = "10" + ln;
        assertThat(out.toString(), is(expected));
    }
}