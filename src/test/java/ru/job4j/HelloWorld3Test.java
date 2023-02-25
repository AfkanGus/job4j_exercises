package ru.job4j;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorld3Test {
    @Test
    public void checkOutHelloJob4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld3.main(null);
        assertThat(out.toString(), is("Hello, Job4j!" + System.lineSeparator()));
    }
}