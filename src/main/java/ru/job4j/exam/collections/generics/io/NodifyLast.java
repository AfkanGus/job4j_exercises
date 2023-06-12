package ru.job4j.exam.collections.generics.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class NodifyLast {
    public static void main(String[] args) throws IOException {
        //создаем обект патч:
        Path file = Paths.get("Attributes.txt");
        //создаем объект для нового значения создания времени
        FileTime newLastAccessTime = FileTime.fromMillis(System.currentTimeMillis());
        try {
            BasicFileAttributeView attributeView = Files.getFileAttributeView(file, BasicFileAttributeView.class);
            attributeView.setTimes(newLastAccessTime, null, null);
            BasicFileAttributes updatedAttributes = attributeView.readAttributes();
            FileTime updatedLastAccessTime = updatedAttributes.lastAccessTime();

            System.out.println("Updated Last Access Time  " + updatedLastAccessTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
