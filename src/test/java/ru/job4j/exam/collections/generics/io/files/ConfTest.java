package ru.job4j.exam.collections.generics.io.files;

import org.junit.jupiter.api.Test;
import ru.job4j.exam.collections.generics.io.Conf;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfTest {
    @Test
    void when() {
        String path = "./data/app.properties";
        Conf config = new Conf(path);
        config.load();
        assertThat(config.value("name")).isEqualTo("Petr Arsentev");
    }
}