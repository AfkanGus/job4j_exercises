package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in)
        );
        String str;
        System.out.println("input line text");
        System.out.println("input 'stop' for end");
        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while (!str.equals("stop"));

    }
}
