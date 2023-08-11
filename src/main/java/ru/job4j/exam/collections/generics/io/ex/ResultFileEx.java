package ru.job4j.exam.collections.generics.io.ex;

import java.io.FileOutputStream;

public class ResultFileEx {
    /*Напишем программу которая записывает текст в файл*/
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("data/dataEx.txt")) {
            out.write("Hell".getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
