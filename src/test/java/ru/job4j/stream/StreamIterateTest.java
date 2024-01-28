package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StreamIterateTest {
    @Test
    void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Integer[] data = {1, 2, 3, 4};
        StreamIterate.showArray(data);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "1" + ln + "3" + ln
        ));

    }
}