package ru.job4j.exam.collections.generics.io;

import java.util.HashMap;
import java.util.Map;

public class ArgsName {
    private final Map<String, String> values = new HashMap<>();

    public String get(String key) {
        if (!values.containsKey(key)) {
            throw new IllegalArgumentException(String.format("This key: '%s' is missing" + key));
        }
        return values.get(key);
    }

    private void parse(String[] args) {
        for (String arg : args) {
            //заменяет первое вхождение символа "-" (минус) в строке arg на пустую строку. Если строка arg начинается с символа "-", он будет удален.
            // разделяет полученную строку на две части, используя символ "=" (равно) в качестве разделителя.
            // Параметр 2 указывает, что разделение должно произойти только один раз. В результате получается массив строк.
            String[] parts = arg.replaceFirst("-", "").split("=", 2);
        }

    }

    public static ArgsName of(String[] args) {

        ArgsName names = new ArgsName();
        names.parse(args);
        return names;
    }

    private void validator(String[] args) {

    }

    public static void main(String[] args) {
        ArgsName jvm = ArgsName.of(new String[]{"-Xmx=512", "-encoding=UTF-8"});
        System.out.println(jvm.get("Xmx"));

        ArgsName zip = ArgsName.of(new String[]{"-out=project.zip", "-encoding=UTF-8"});
        System.out.println(zip.get("out"));
    }
}
