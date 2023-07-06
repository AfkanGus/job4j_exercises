package ru.job4j.exam.collections.generics.io;

import java.util.HashMap;
import java.util.Map;

public class ArgsName {
    public final Map<String, String> values = new HashMap<>();

    public String get(String key) {
        if (!values.containsKey(key)) {
            throw new IllegalArgumentException(String.format("This key: '%s' is missing", key));
        }
        return values.get(key);
    }

    private void parse(String[] args) {
        for (String arg : args) {
            //заменяет первое вхождение символа "-" (минус) в строке arg на пустую строку. Если строка arg начинается
            // с символа "-", он будет удален.
            // разделяет полученную строку на две части, используя символ "=" (равно) в качестве разделителя.
            // Параметр 2 указывает, что разделение должно произойти только один раз. В результате получается массив
            // строк.
            String[] parts = arg.replaceFirst("-", "").split("=", 2);
            String key = parts[0]; // здесь хранится ключ
            String value = parts[1]; // здест хранится значение
            values.put(key, value);
        }

    }

    public static ArgsName of(String[] args) {
        validate(args);
        // Если проверка проходит успешно, то создается новый экземпляр
        // класса ArgsName с помощью оператора new, и затем вызывается метод parse(args),
        // который анализирует и разбирает аргументы командной строки и сохраняет
        // их во внутреннюю структуру данных класса ArgsName.
        ArgsName names = new ArgsName();
        names.parse(args);
        // возвращает экземпляр класса ArgsName, который содержит разобранные и проверенные аргументы командной строки.
        return names;
    }

    /*
    validator(args), который выполняет проверку аргументов
     командной строки на соответствие определенным правилам и выбрасывает исключения в случае нарушения этих правил
     */
    private static void validate(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("Arguments not passed to program");
        }
        for (String arg : args) {
            if (!arg.startsWith("-")) {
                throw new IllegalArgumentException("Error: This argument '%s' does not start with a '-' character".formatted(arg));
            }
            if (!arg.contains("=")) {
                throw new IllegalArgumentException("Error: This argument '%s' does not contain an equal sign".formatted(arg));
            }
            if (arg.indexOf("=") == arg.length() - 1) {
                throw new IllegalArgumentException("Error: This argument '%s' does not contain a value".formatted(arg));
            }
            if (arg.indexOf("=") == 1) {
                throw new IllegalArgumentException("Error: This argument '%s' does not contain a key".formatted(arg));
            }

        }
    }

    public static void main(String[] args) {
        ArgsName jvm = ArgsName.of(new String[]{"-Xmx=512", "-encoding=UTF-8"});
        System.out.println(jvm.get("Xmx"));

        ArgsName zip = ArgsName.of(new String[]{"-out=project.zip", "-encoding=UTF-8"});
        System.out.println(zip.get("out"));
    }
}
