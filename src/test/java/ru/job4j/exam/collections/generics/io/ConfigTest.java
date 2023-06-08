package ru.job4j.exam.collections.generics.io;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ConfigTest {
    @Test
    public void testReadFileWithCommentsAndEmptyLines() {
        Config config = new Config("./data/test_comments.properties");
        config.load();

        assertEquals("value1", config.value("key1"));
        assertEquals("value2", config.value("key2"));
        assertEquals("value3", config.value("key3"));
        assertEquals("value4", config.value("key4"));
    }

    @Test
    public void testReadFileWithInvalidFormat() {
        Config config = new Config("./data/test_invalid.properties");

        // При загрузке файла с нарушенным форматом ожидаем исключение IllegalArgumentException
        assertThrows(IllegalArgumentException.class, config::load);
    }

    @Test
    public  void whenPairWithoutComment() {
        String path = "./data/pair_without_comments.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("hibernate.connection.driver_class"))
                .isEqualTo("org.postgresql.Driver");
    }

    @Test
    public  void whenPairWithComment() {
        String path = "./data/pair_with_comment.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("hibernate.connection.username"))
                .isEqualTo("postgres");
    }

    @Test
    public  void whenPairWithEmptyLine() {
        String path = "./data/pair_with_empty_line.properties";
        Config config = new Config(path);
        config.load();
        assertThat(config.value("hibernate.connection.username"))
                .isEqualTo("postgres");
    }

    @Test
    public  void whenPairCheckIllegalArgumentExceptionHasNotKey() {
        String path = "./data/pair_without_key.properties";
        Config config = new Config(path);
        assertThatThrownBy(config::load)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a key");
    }

    @Test
    public   void whenPairCheckIllegalArgumentExceptionHasMotValue() {
        String path = "./data/pair_without_value.properties";
        Config config = new Config(path);
        assertThatThrownBy(config::load)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain a value");
    }

    @Test
    public  void whenPairCheckIllegalArgumentExceptionHasNotSymbol() {
        String path = "./data/pair_without_symbol.properties";
        Config config = new Config(path);
        assertThatThrownBy(config::load)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("does not contain the symbol \"=\"");
    }
}
