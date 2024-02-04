package ru.job4j.exam.collections.generics.io;

import java.io.*;

public class BufWr {
    public static void main(String[] args) {
        String data = " Helo Word";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outp.txt"))) {
            bufferedWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
