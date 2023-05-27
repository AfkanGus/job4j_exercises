package ru.job4j.exam.collections.generics.iobook;

import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("Is string");
        int i = -7;
        printWriter.println(i);
        double d = 4.5e-7;
        printWriter.println(d);
    }
}
