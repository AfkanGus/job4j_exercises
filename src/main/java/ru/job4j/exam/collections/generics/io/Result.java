package ru.job4j.exam.collections.generics.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Result {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("data/dataresult.txt");
            out.write("Hello Said".getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
