package ru.job4j.exam.collections.generics.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UsageSet {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.addAll(List.of("one", "four", "five"));
        for (String s : strings) {
            System.out.println("Текущий элемент: " + s);
        }
    }
}

