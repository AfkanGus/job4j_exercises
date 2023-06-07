package ru.job4j.exam.collections.generics.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ResultFile {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(
                new BufferedOutputStream(
                        new FileOutputStream(
                                "data/result.txt"
                        )
                )
        )) {
            out.println("Hello,Said!");
            out.printf("%s%n", "Some string");
            out.printf("%d%n", 19);
            out.printf("%f%n", 1.5f);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
