package ru.job4j.exam.collections.generics.iobook;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "C:\\projects";
        try (DirectoryStream<Path> dirstrim = Files.newDirectoryStream(Paths.get(dirname))) {
            System.out.println(dirname);
            for (Path enty : dirstrim) {
                BasicFileAttributes attributes = Files.readAttributes(
                        enty, BasicFileAttributes.class
                );
                if (attributes.isDirectory()) {
                    System.out.println("<DIR>");
                } else {
                    System.out.println("   ");
                }
                System.out.println(enty.getName(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
