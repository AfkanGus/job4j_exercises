package ru.job4j.exam.collections.generics.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputStream {
    public static void main(String[] args) {
        System.out.println();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] bytes = "Massege".getBytes();
        byte[] byteArray = out.toByteArray();
        out.writeBytes(bytes);
        System.out.println(out);
        try (FileOutputStream fileOutput = new FileOutputStream("data/message.txt")) {
            out.writeTo(fileOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
