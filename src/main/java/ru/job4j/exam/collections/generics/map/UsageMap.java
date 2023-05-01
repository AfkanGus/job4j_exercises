package ru.job4j.exam.collections.generics.map;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        for (String key : map.keySet()) {
            String v = map.remove(key);
            System.out.println(key + " " + v);
        }
    }
}
