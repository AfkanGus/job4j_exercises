package ru.job4j;

import org.junit.Test;
import ru.job4j.firstprog.Task17;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task17Test {
    @Test
    public void shouldOutputSqrAndCubeOf6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.main(null);
        String expected = "6" + System.lineSeparator() + "36" + System.lineSeparator() + "216" + System.lineSeparator();
        assertThat(out.toString(), is(expected));
    }
}