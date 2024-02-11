package ru.job4j.exam.collections.generics.io;

import java.io.File;
import java.util.Arrays;

/**
 * программа должна выводить имя файла и его размер.
 */
public class Dir {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\af\\IdeaProjects\\job4j_exercises\\out.txt");
        if (file.exists()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));

        }
        System.out.println(String.format("size : %s", file.length()));

        /*if (!file.exists()) {
            throw new IllegalArgumentException(String.format("No exist %s", file.getAbsoluteFile()));
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(String.format("No directory %s", file.getAbsoluteFile()));
        }
        System.out.println(String.format("Directory : %s", file.getAbsolutePath()));
        File[] files = file.listFiles();
        Arrays.stream(files)
                .forEach(subfile -> {
                    if (subfile.isFile()) {
                        System.out.println(String.format("Name : %s, Size: %d bytes ", subfile.getName(),
                                subfile.length()));
                    } else {
                        System.out.println(String.format("Name: %s", subfile.getName()));
                    }
                    long fileSize = subfile.length();
                    String sizeSuffix = "bytes";
                    if (fileSize > 1024) {
                        fileSize /= 1024;
                        sizeSuffix = "KB";
                    }
                    if (fileSize > 1024) {
                        fileSize /= 1024;
                        sizeSuffix = "MB";
                    }
                    System.out.println(String.format("Name : %s, Size: %d %s", subfile.getName(), fileSize,
                            sizeSuffix));

                });*/
    }
}
