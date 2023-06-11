package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVIsitor extends SimpleFileVisitor<Path> {
    public static void main(String[] args) throws IOException {
       /* String dirname = "C:\\projects";
        System.out.println(dirname + ": \n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVIsitor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FileVisitResult visitFile(Path paths, BasicFileAttributes attributes) throws IOException {
        System.out.println(paths);
        return FileVisitResult.CONTINUE;
    }*/
        Path directory = Path.of("c:\\projects"); // Замените на свой путь к каталогу
        Files.walkFileTree(directory, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Файл: " + file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                System.out.println("Каталог: " + dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}
