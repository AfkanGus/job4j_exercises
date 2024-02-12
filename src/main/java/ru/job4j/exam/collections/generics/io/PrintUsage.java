package ru.job4j.exam.collections.generics.io;

import java.io.*;

public class PrintUsage {
    public static void main(String[] args) {
        try (PrintStream stream = new PrintStream(new FileOutputStream("data/print.txt"));
             PrintWriter writer = new PrintWriter("data/write.txt")) {
            stream.println("Из PrintStream в FileOutputStream");
            stream.write("Новая строка".getBytes());
            writer.println("Новое сообщение");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
