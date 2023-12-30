package ru.job4j.exam.collections.generics.io;

import java.io.FileOutputStream;

public class Result {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("dataresult.txt")) {
            out.write("Hello Said".getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
