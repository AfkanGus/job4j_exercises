package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

import static java.nio.file.FileVisitResult.CONTINUE;

public class PrintFiles extends SimpleFileVisitor<Path> {
    public FileVisitResult visitResult(Path file, BasicFileAttributes attributes) throws IOException {
        if (attributes.isSymbolicLink()) {
            System.out.format("Symbolic link :%s ", file);
        } else if (attributes.isRegularFile()) {
            System.out.format("Regular fle:%s ", file, Files.probeContentType(file));
        } else {
            System.out.format("Other : %s ", file);
        }
        System.out.println("(" + attributes.size() + "bytes)");
        return CONTINUE;
    }

    public FileVisitResult postVisitDirectory(Path dir, IOException exception) {
        System.out.format("Directory: %s%n", dir);
        return CONTINUE;
    }

    public FileVisitResult visitFileFailed(Path file, IOException exception) {
        System.out.println(exception);
        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path startDir = Paths.get("C:/projects/job4j_exercises/data");
        PrintFiles printFiles = new PrintFiles();
        EnumSet<FileVisitOption> options = EnumSet.of(FileVisitOption.FOLLOW_LINKS);
        int maxDepth = 2;
        Files.walkFileTree(startDir, options, maxDepth, printFiles);

    }
}
