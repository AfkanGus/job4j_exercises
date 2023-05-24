package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Чтение символов
 */
public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        System.out.print("Push char, 'q' - for output");
        do {
            c = (char) br.read();
            System.out.print(c);
        } while (c != 'q');
    }
}
