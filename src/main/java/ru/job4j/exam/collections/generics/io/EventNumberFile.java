package ru.job4j.exam.collections.generics.io;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;

public class EventNumberFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("data/event.txt")) {
            StringBuilder text = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                text.append((char) read);
            }
            String[] num = text.toString().split(System.lineSeparator());
            for (String numbers : num) {
                boolean rsl = (Integer.parseInt(numbers) % 2 == 0);
                System.out.println(rsl + " " + numbers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}