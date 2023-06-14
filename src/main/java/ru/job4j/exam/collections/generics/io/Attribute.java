package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Attribute {
    public static void main(String[] args) throws IOException {
     /*   Path file = Path.of("Attributes.txt");
        Files.createFile(file);
        BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(file, BasicFileAttributeView.class);
        BasicFileAttributes attributes = basicFileAttributeView.readAttributes();
        System.out.println(attributes);
        Path file1 = Path.of("Attributes1.txt");
        Files.createFile(file1);
        BasicFileAttributes attributes1 = Files.readAttributes(file1, BasicFileAttributes.class);
        System.out.println(attributes1);*/
        Path file3 = Path.of("Attributes3");
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
        System.out.println(attributes3.getClass());
    }
}
