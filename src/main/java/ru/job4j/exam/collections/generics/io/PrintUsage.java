package ru.job4j.exam.collections.generics.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintUsage {
    public static void main(String[] args) {
        try (PrintStream stream = new PrintStream(
                new FileOutputStream("data/print.txt"));
             PrintStream stream1 =
                     new PrintStream(new FileOutputStream("data/print1.txt", true))) {
            stream.println("From PrintStream in FileOutputStream");
            stream.write("New string".getBytes());
            stream1.flush();
            stream1.write("new String 1".getBytes());
            stream1.write("new String2".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
