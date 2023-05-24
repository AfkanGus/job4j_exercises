package ru.job4j.exam.collections.generics.io;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Использование: ShowFile name_file");
            return;
        }

        String filePath = args[0];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
