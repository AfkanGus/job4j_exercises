package ru.job4j.exam.collections.generics.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("data/input.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int textRead;
            while ((textRead = fileInputStream.read()) != -1) {
                stringBuilder.append((char) textRead);
              /*  String[] lines = stringBuilder.toString().split(System.lineSeparator());
                for (String line : lines) {
                    System.out.println(line);
                }*/
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
