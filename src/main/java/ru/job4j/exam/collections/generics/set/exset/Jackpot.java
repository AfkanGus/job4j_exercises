package ru.job4j.exam.collections.generics.set.exset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> str = new HashSet<>();
        str.addAll(Arrays.asList(combination));
        return str.size() == 1;
    }
}
