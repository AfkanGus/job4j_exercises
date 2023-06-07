package ru.job4j.exam.collections.generics.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Result {
    public static void main(String[] args) {
        //java.io.FileOutputStream - записывает данные в файл
        try (FileOutputStream fileOutputStream = new FileOutputStream("data/dataresult.txt")) {
            fileOutputStream.write("Helo Said".getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
