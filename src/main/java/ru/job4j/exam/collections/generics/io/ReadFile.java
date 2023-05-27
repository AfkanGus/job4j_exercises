package ru.job4j.exam.collections.generics.io;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("data/input.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int textRead;
            while ((textRead = inputStream.read()) != -1) {
                stringBuilder.append((char) textRead);

            }
            System.out.println(stringBuilder);
            String[] lines = stringBuilder.toString().split(System.lineSeparator());
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
