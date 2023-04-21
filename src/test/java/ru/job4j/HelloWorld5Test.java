package ru.job4j;

import org.junit.Test;
import ru.job4j.firstprog.HelloWorld5;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorld5Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        HelloWorld5.main(null);
        assertThat(out.toString(), is("Hello, Job4j!" + System.lineSeparator()));
    }
}