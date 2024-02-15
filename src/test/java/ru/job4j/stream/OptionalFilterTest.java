package ru.job4j.stream;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static ru.job4j.stream.OptionalFilter.*;

public class OptionalFilterTest {

    @Test
    public void whenWorkerHave2ChildrenThenEmptyList() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 12);
        Child c3 = new Child("c3", 11);
        Child c4 = new Child("c4", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2));
        Worker worker2 = new Worker("456", List.of(c3, c4));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenWorkerHave1ChildThenEmptyList() {
        Child c2 = new Child("c2", 12);
        Child c4 = new Child("c4", 15);
        Child c5 = new Child("c5", 9);
        Worker worker1 = new Worker("123", List.of(c2));
        Worker worker2 = new Worker("456", List.of(c4, c5));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenWorkerHave3Children15And13And10ThenListOf2() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 13);
        Child c3 = new Child("c3", 10);
        Child c4 = new Child("c4", 15);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4));
        assertEquals(2, OptionalFilter.defineChildren(List.of(worker1, worker2), "123").size());
    }

    @Test
    public void whenWorkerHave3Children13And10And9ThenListOf3() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 13);
        Child c3 = new Child("c3", 10);
        Child c4 = new Child("c4", 15);
        Child c5 = new Child("c5", 9);
        Worker worker1 = new Worker("123", List.of(c2, c3, c5));
        Worker worker2 = new Worker("456", List.of(c1, c4));
        assertEquals(3, OptionalFilter.defineChildren(List.of(worker1, worker2), "123").size());
    }

    @Test
    public void whenWorkerHave3Children15And16And17ThenEmptyList() {
        Child c1 = new Child("c1", 15);
        Child c2 = new Child("c2", 16);
        Child c3 = new Child("c3", 17);
        Child c4 = new Child("c4", 12);
        Child c5 = new Child("c5", 9);
        Worker worker1 = new Worker("123", List.of(c1, c2, c3));
        Worker worker2 = new Worker("456", List.of(c4, c5));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenWorkerHaventGotChildrenThenEmptyList() {
        Child c4 = new Child("c4", 12);
        Child c5 = new Child("c5", 9);
        Worker worker1 = new Worker("123", List.of());
        Worker worker2 = new Worker("456", List.of(c4, c5));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }
}