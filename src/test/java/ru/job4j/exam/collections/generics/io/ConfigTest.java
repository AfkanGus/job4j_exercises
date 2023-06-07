package ru.job4j.exam.collections.generics.io;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ConfigTest {
    @Test
    public void whenPairWithoutComment() {
        String path = "./data/app.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("name")).isEqualTo("Petr Arsentev");
    }
}