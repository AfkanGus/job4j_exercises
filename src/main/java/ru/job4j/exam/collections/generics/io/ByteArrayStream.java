package ru.job4j.exam.collections.generics.io;

import java.io.ByteArrayInputStream;

public class ByteArrayStream {
    public static void main(String[] args) {
        String str = "abc";
        byte bytes1[] = str.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(bytes1);
        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (i == 0) {
                    System.out.print((char) c);
                } else {
                    System.out.print(Character.toUpperCase((char) c));
                }
            }
            System.out.println();
            in.reset();
        }
    }
}

