package ru.job4j;

import org.junit.Test;
import ru.job4j.firstprog.Task16;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task16Test {
    @Test
    public void eachSequenceOfSameSymbolOnsOnSeparateLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task16.main(null);
        assertThat(out.toString(), is("+++!!!!??"));
    }
}