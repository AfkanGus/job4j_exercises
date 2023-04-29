package ru.job4j.exam.collections.generics.set.exset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> str = new HashSet<>();
        str.addAll(Arrays.asList(s.split("")));
        return str.size() == s.length();
    }
}
