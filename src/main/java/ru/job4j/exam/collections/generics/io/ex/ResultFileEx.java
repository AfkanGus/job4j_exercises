package ru.job4j.exam.collections.generics.io.ex;

import java.io.FileOutputStream;

public class ResultFileEx {
    /*Напишем программу которая записывает текст в файл*/
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("data/tableUm")) {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = (i + 1) * (j + 1);
                    String str = Integer.toString(array[i][j]);
                    out.write(str.getBytes());
                }
                out.write(System.lineSeparator().getBytes());
            }
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }
}

