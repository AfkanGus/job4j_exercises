package ru.job4j.exam.collections.generics.io;

import java.io.File;

/**
 * программа позволяет вывести имена файлов и их размеры всех файлов в директории.
 */
public class FileListiningEx {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\af\\IdeaProjects\\job4j_exercises\\src\\main\\java\\ru\\job4j\\exam"
                +
                "\\collections\\generics\\io";
        File filess = new File("C:\\Users\\af\\IdeaProjects\\job4j_exercises\\src\\main\\java\\ru\\job4j\\exam"
                +
                "\\collections\\generics\\io\\teeee.txt");
        System.out.println(filess.toPath());
     /*   File directory = new File(directoryPath);
        if (!directory.exists()) {
            System.out.println("Directory is  not tru");
            return;
        }
        if (!directory.isDirectory()) {
            System.out.println("THis is not directory");
            return;
        }
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("Name  " + file.getName() + "Lentgch  " + file.length() + " bayt  ");
                }
            }
        } else {
            System.out.println("Erro from gift file");
        }
        String[] filesAndDirs = directory.list();
        if (filesAndDirs != null) {
            for (String name : filesAndDirs) {
                System.out.println(name);
            }
        }*/
    }
}