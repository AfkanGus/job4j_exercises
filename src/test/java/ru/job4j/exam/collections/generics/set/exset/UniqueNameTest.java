package ru.job4j.exam.collections.generics.set.exset;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UniqueNameTest {
    @Test
    public void main() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        UniqueName.main(null);
        String ln = System.lineSeparator();
        String expected = "Next element exist? - true." + ln
                + "five" + ln
                + "Next element exist? - true." + ln
                + "four" + ln
                + "Next element exist? - true." + ln
                + "one" + ln
                + "Next element exist? - true." + ln
                + "three" + ln
                + "Next element exist? - true." + ln
                + "two" + ln;
        assertThat(out.toString(), is(expected));
    }
}