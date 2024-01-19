package ru.job4j.exam.collections.generics.io.ex;

import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("data/event.txt")) {
            StringBuilder txt = new StringBuilder();
            int read;
            while ((read = in.read()) != -1) {
                txt.append((char) read);
            }
            String[] num = txt.toString().split(System.lineSeparator());
            for (String numbers : num) {
                boolean rsl = (Integer.parseInt(numbers) % 2 == 0);
                System.out.println(rsl);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}