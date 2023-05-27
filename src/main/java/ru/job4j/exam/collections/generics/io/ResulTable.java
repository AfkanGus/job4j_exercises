package ru.job4j.exam.collections.generics.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class ResulTable {
    public static void main(String[] args) {
        try {
            FileOutputStream outputStream = new FileOutputStream("data/dataresultable.txt");
            int[][] multiplicationTable = new int[10][10];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    multiplicationTable[i][j] = (i + 1) * (j + 1);
                    String q = Integer.toString(multiplicationTable[i][j]);
                    outputStream.write(q.getBytes());
                    outputStream.write("".getBytes());

                }
                outputStream.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
