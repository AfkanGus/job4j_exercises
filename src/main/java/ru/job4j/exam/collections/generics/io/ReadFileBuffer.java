package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBuffer {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new FileReader("data/input.txt"))) {
            in.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
