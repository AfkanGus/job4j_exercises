package ru.job4j.exam.collections.generics.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Attribute {
    public static void main(String[] args) throws IOException {
        Path file1 = Path.of("C:\\Users\\af\\IdeaProjects\\job4j_exercises\\Attributes1.txt");
        try {
            BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(file1,
                    BasicFileAttributeView.class);
            if (basicFileAttributeView != null) {
                Instant carrentTime = Instant.now();
                Instant yesterday = carrentTime.minus(1, ChronoUnit.DAYS);
                FileTime yesterdayFileTime = FileTime.from(yesterday);
                basicFileAttributeView.setTimes(yesterdayFileTime, yesterdayFileTime, yesterdayFileTime);
                System.out.println(yesterday);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


       /* Path file3 = Path.of("Attributes3");
        Files.createFile(file3);
        BasicFileAttributes attributes3 = Files.readAttributes(file3, BasicFileAttributes.class);
        System.out.println(attributes3.getClass());
        System.out.println("THis is file - " + attributes3.isRegularFile());
        System.out.println("is this directory =" + attributes3.isDirectory());
        System.out.println("is this link   " + attributes3.isSymbolicLink());
        System.out.println("is not file " + attributes3.isOther());
        System.out.println("date file" + attributes3.creationTime());
        System.out.println("size " + attributes3.size());
        System.out.println("Время последнего доступа: " + attributes3.lastAccessTime());
        System.out.println("Время последнего изменения: " + attributes3.lastModifiedTime());
        System.out.println(attributes3.getClass());*/


