package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FireReadingExample {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("C:\\projects\\job4j_exercises\\src\\main\\java\\ru\\job4j\\exam\\collections\\generics\\io", "access.log");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
