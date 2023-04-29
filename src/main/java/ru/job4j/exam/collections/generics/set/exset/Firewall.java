package ru.job4j.exam.collections.generics.set.exset;

import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] str = s.split(" ");
        for (String string : str) {
            if (words.contains(string)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }
}
