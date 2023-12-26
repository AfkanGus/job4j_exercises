package ru.job4j.exam.collections.generics.string;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task49Test {
    public String ln = System.lineSeparator();

    @Test
    public void when373ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task49.isPalindrome(373);
        String expected = "Да" + ln;
        assertThat(out.toString(), is(expected));
    }

}