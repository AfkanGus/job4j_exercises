package ru.job4j.exam.collections.generics.iobook;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveWordsToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для выхода введите 'exit'):");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.home") + "/Desktop/words.txt"));

            while (true) {
                String word = scanner.nextLine();

                if (word.equalsIgnoreCase("exit")) {
                    break;
                }

                writer.write(word);
                writer.newLine();
            }

            writer.close();

            System.out.println("Слова сохранены в файл на рабочем столе.");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении в файл.");
            e.printStackTrace();
        }
    }
}

