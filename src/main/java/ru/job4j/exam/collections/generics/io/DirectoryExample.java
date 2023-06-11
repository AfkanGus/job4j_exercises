package ru.job4j.exam.collections.generics.io;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
    public static void main(String[] args) throws IOException {
        File d = new File("src/main/java/ru/job4j/io");
        d.deleteOnExit();
    }
}