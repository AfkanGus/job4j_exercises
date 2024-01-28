package ru.job4j.devmark;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineReader {
    public static long getLineCountReader(String fileName) throws IOException {
        var lines = 0L;
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        }
    }

    public static void main(String[] args) throws IOException {
        long total = 0;
        int stepCount = 10;
        long longCount = 0;
        for (int i = 0; i < stepCount; i++) {
            long begin = System.currentTimeMillis();
            longCount = getLineCountReader("C:/projects/job4j_exercises/data/404.txt");
            total += System.currentTimeMillis() - begin;
        }
        System.out.printf("Line count : %s.%n", longCount);
        System.out.printf("Average time: %s ms.%n", total / stepCount);
    }
}
