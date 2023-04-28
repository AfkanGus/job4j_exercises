package ru.job4j.exam.collections.generics.set;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> hashSet = new HashSet<>();
        for (String word : origin) {
            hashSet.add(word);
        }
        for (String word : text) {
            if (!hashSet.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;

    }
}
