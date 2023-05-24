package ru.job4j.exam.collections.generics.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapIteratorOrderExample {
    public static void main(String[] args) {
        Map<String, Integer> originMap = new LinkedHashMap<>();
        originMap.put("Apple", 1);
        originMap.put("Banana", 2);
        originMap.put("Orange", 3);
        Map<String, Integer> newMap = new LinkedHashMap<>(originMap);
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
