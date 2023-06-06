package ru.job4j.exam.collections.generics.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LofFilter {
    public static List<String> filter(String file) {
        List<String> filtered = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts[parts.length - 2].equals("404")) {
                    filtered.add(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return filtered;
    }

    public static void save(List<String> log, String file) {
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String line : log) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        List<String> log = filter("data/log.txt");
        save(log, "data/404.txt");
    }
}
