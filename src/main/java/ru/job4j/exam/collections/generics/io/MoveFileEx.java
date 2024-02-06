package ru.job4j.exam.collections.generics.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFileEx {
    public static void main(String[] args) throws IOException {
        File sourceDirectory = new File("C:\\ource");
        File sourceFile = new File(sourceDirectory, "example.txt");
        File targetDirectory = new File("C:\\target");
        File targetFile = new File(targetDirectory, "example1.txt");

        if (!sourceDirectory.exists()) {
            sourceDirectory.mkdirs();
        }
        if (!targetDirectory.exists()) {
            targetDirectory.mkdirs();
        }
        if (!sourceFile.exists()) {
            sourceFile.createNewFile();
        }
        if (sourceFile.renameTo(targetFile)) {
            System.out.println("tru");
        } else {
            System.out.println("not");
        }
    }
}
