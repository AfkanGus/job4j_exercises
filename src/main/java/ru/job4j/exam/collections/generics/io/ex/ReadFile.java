package ru.job4j.exam.collections.generics.io.ex;

import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("data/input.txt")) {
            StringBuilder txt = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                txt.append((char) read);
            }
            String[] lines = txt.toString().split(System.lineSeparator());
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}