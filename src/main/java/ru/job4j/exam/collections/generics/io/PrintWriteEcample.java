package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintWriteEcample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("data/output.txt");
             PrintWriter writer1 = new PrintWriter(System.out);
             PrintWriter writer2 = new PrintWriter("data/outp.txt", "UTF-8")) {
            int number = 40;
            double value = 3.14;
            writer1.println(number);
            writer1.println(value);
            writer2.println("jkjkj9jkこんにちは、世界！");

            writer.println("Hello<word,");
            writer.printf("Number: %d, Text: %s", 442, "Example");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
