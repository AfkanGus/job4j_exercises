package ru.job4j.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapLambdaUsage {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Shoes", 200);

        BiFunction<Integer, Integer, Integer> function = (oldValue, newValue) -> oldValue - newValue;
        int newPrice = map.merge("Shoes", 50, function);
        System.out.println("New price: " + newPrice);
        map.forEach((key, value) -> System.out.println("Key: " + key + ", value: " + value));
        System.out.println("New price: " + newPrice);
        System.out.println("Price of shirt: " + map.merge("Shirt", 100, function));

    }
}
