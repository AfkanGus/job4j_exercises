package ru.job4j.exam.collections.generics.string;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class LogLineTest {
    @Test
    public void whenParseSingleLine() {
        var line = new LogLine().parse(
                "WARNING [threads [zqfz [wbye [zfq]]] - 1] wqqa [e] zqw"
        );
        assertThat(line.level(),
                is("WARNING"));
        assertThat(line.threads(),
                is("[threads [zqfz [wbye [zfq]]] - 1]"));
        assertThat(line.text(),
                is("wqqa [e] zqw"));
    }
}