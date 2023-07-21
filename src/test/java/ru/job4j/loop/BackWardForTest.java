package ru.job4j.loop;


import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BackWardForTest {
    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        BackwardFor.out(5, 1);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "5" + ln + "4"
                        + ln + "3" + ln + "2"
                        + ln
        ));
    }
}