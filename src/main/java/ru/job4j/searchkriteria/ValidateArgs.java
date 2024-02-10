package ru.job4j.searchkriteria;

import java.util.HashMap;
import java.util.Map;

public class ValidateArgs {
    private static Map<String, String> values = new HashMap<>();

    static void parseArgs(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Некорректные аргументы.Программа должна запускаться с параметрами, например: -d=c: -n=*.?xt -t=mask -o=log.txt");
        }
        for (String arg : args) {
            if (arg.startsWith("-") && arg.contains("=")) {
                String[] parts = arg.substring(1).split("=", 2);
                values.put(parts[0], parts[1]);
            }
        }
    }

    static Map<String, String> createMapArgs() {
        if (!values.containsKey("d")) {
            throw new IllegalArgumentException("Отсутствует обязательный аргумент -d");
        }
        if (!values.containsKey("n")) {
            throw new IllegalArgumentException("Отсутствует обязательный аргумент -n");
        }
        if (!values.containsKey("t")) {
            throw new IllegalArgumentException("Отсутствует обязательный аргумент -t");
        }
        if (!values.containsKey("o")) {
            throw new IllegalArgumentException("Отсутствует обязательный аргумент -o");
        }
        return values;
    }
}
