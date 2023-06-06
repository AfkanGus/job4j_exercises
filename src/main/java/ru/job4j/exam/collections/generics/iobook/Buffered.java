package ru.job4j.exam.collections.generics.iobook;

import java.io.*;

public class Buffered {
    public static void main(String[] args) {
        try (BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("data/newData.txt"));
             BufferedOutputStream out = new BufferedOutputStream(
                     new FileOutputStream("data/duferout.txt", true))) {
            out.write(in.readAllBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
