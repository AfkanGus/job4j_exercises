package ru.job4j.exam.collections.generics.io;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*прочитать данные из CSV и вывести их на пчать.*/
public class CSVReader {
    public static void handle(ArgsName argsName) throws Exception {
        String output = argsName.get("out");
        try (Scanner scanner = new Scanner(new FileInputStream(argsName.get("path")));
             PrintStream out = "stdout".equals(output) ? new PrintStream(System.out)
                     : new PrintStream(new FileOutputStream(output))) {
            scanner.useDelimiter(System.lineSeparator());
            List<String> filters = Arrays.stream(argsName.get("filter").split(","))
                    .collect(Collectors.toList());
            List<String> columns = Arrays.stream(scanner.next().split(argsName.get("delimiter")))
                    .collect(Collectors.toList());
            List<Integer> indexes = filters.stream()
                    .mapToInt(columns::indexOf)
                    .filter(index -> index != -1)
                    .boxed()
                    .collect(Collectors.toList());

            String filteredColumns = filterLine(columns, indexes, argsName.get("delimiter"));
            out.println(filteredColumns);
            while (scanner.hasNext()) {
                List<String> line = Arrays.asList(scanner.next().split(argsName.get("delimiter")));
                String filteredLine = filterLine(line, indexes, argsName.get("delimiter"));
                out.println(filteredLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String filterLine(List<String> line, List<Integer> indexes, String delimiter) {
        return indexes.stream()
                .map(line::get)
                .collect(Collectors.joining(delimiter));
    }

    private static boolean checkArgs(ArgsName argsName) {
        if (!Paths.get(argsName.get("path")).toFile().exists()) {
            throw new IllegalArgumentException("The file does not exist");
        }
        if (argsName.get("out").isEmpty()) {
            throw new IllegalArgumentException("Out doesn't exist");
        }
        if (argsName.get("filter").isBlank()) {
            throw new IllegalArgumentException("Filter doesn't exist");
        }
        return true;
    }

    /*Прочитать данные из файла и вывести их*/
    public static void main(String[] args) throws Exception {

        ArgsName argsName = ArgsName.of(args);
        if (args.length != 4) {
            throw new IllegalArgumentException("args.length != 4");
        }
        checkArgs(argsName);
        handle(argsName);
    }
}



