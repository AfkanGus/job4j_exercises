package ru.job4j;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task19Test {
    @Test
    public void shouldOutputStringPlusNumber() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.main(null);
        String expected = "Значение x равно 9" + System.lineSeparator() + "Значение x^2 равно 81" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}