package ru.job4j.exam.collections.generics.set.exset;

import java.util.*;

public class UniqueName {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>(Set.of("one", "two", "three", "four", "five"));
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(String.format("Next element exist? - %s.", true));
            System.out.println(iterator.next());
        }
    }
}
