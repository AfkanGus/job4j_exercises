package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 5. Очередь с приоритетом на LinkedList [#41670 #58972]
 */
class ZadachaTest {
    @Test
    public void whenHigherPrioritySecond() {
        PrioritetOchered queue = new PrioritetOchered();
        queue.put(new Zadachi("low", 5));
        queue.put(new Zadachi("urgent", 1));
        queue.put(new Zadachi("middle", 3));
        Zadachi result = queue.poluchitZadachu();
        assertThat(result.getOpisanieZadachi()).isEqualTo("urgent");
    }

    @Test
    public void whenHigherPriorityEquals() {
        PrioritetOchered queue = new PrioritetOchered();
        queue.put(new Zadachi("low", 5));
        queue.put(new Zadachi("urgent", 5));
        queue.put(new Zadachi("middle", 5));
        Zadachi result = queue.poluchitZadachu();
        assertThat(result.getOpisanieZadachi()).isEqualTo("low");
    }
}