package ru.job4j;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * 5. Очередь с приоритетом на LinkedList [#41670 #58972]
 */
public class PrioritetOchered {
    private PriorityQueue<Zadachi> spisokZadach =
            new PriorityQueue<>(Comparator.comparingInt(Zadachi::getPrioritet));

    public void put(Zadachi zadachi) {
        this.spisokZadach.add(zadachi);
    }

    public Zadachi poluchitZadachu() {
        return spisokZadach.poll();
    }

}
