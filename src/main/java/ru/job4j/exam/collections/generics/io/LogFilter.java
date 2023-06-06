package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogFilter {
    public List<String> filter(String file) {
        List<String> filterLine = new ArrayList<>();
        try (FileReader in = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(in)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts[parts.length - 2].equals("404")) {
                    filterLine.add(line);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return filterLine;
    }

    public static void main(String[] args) {
        LogFilter logFilter = new LogFilter();
        List<String> log = logFilter.filter("data/log.txt");
        log.forEach(System.out::println);

    }
}
