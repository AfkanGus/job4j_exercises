package ru.job4j.exam.collections.generics.iobook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile1 {
    public static void main(String[] args) {
        int i;
        FileInputStream inputStream = null;
        if (args.length != 1) {
            System.out.println(System.getProperty("user.home") + "/Desktop/words.txt");
            return;
        }

        try {
            inputStream = new FileInputStream(System.getProperty("user.home") + "/Desktop/words.txt");
            do {
                i = inputStream.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while ((i != -1));
        } catch (FileNotFoundException e) {
            System.out.println("Файл найден");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
