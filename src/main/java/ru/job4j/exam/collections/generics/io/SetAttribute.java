package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class SetAttribute {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("Attributes.txt");
        try {
            FileTime newLastNodifiedTIme = FileTime.fromMillis(System.currentTimeMillis());
            Files.setAttribute(filePath, "lastModifiedTime", newLastNodifiedTIme);
            Files.setAttribute(filePath, "dos:hidden", true);

            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            FileTime lastModifiedTime = attributes.lastModifiedTime();
            boolean isHidden = (boolean) Files.getAttribute(filePath, "dos:hidden");
            System.out.println("Last Modified Time: " + lastModifiedTime);
            System.out.println("Is Hidden: " + isHidden);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
