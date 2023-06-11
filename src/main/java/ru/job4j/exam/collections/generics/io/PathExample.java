package ru.job4j.exam.collections.generics.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) throws IOException {
        /*
         метод get(), который помещает путь внутрь объекта Paths.
         */
        Path dir = Paths.get("path/paths");
        /*
         создать конкретную директорию методом Files.createDirectory(),
         но только, если все остальные директории в пути уже существуют.
         */
        Files.createDirectories(dir);
        /*
        . Второй способ заключается в том, что путь к файлу инкапсулируется
         с помощью метода of() класса Path. Рекомендуется использовать этот способ,
          так как метод Paths.get() под капотом вызывает метод Path.of().
         */
        Path path = Path.of("path/paths/path.txt");
        Files.createFile(path);
        /*
         перемещается из директории paths в директорию path с помощью метода move()
         */
        Files.move(path, Path.of("path/path.txt"));
        /*
         методы toFile() и toPath() для перевода в объекты File и Path:
         */
        File file = path.toFile();
        System.out.println(file);
        Path pathAgain = file.toPath();
        System.out.println(pathAgain);
        System.out.println("Файл/директория существует?: " + Files.exists(path));
        System.out.println("Это директория?: " + Files.isDirectory(path));
        System.out.println("Это файл?: " + Files.isRegularFile(path));
        System.out.println("Имя файла: " + path.getFileName());
        System.out.println("Путь к файлу абсолютный?: " + path.isAbsolute());
        System.out.println("Родительская директория файла: " + path.getParent());
        System.out.println("Абсолютный путь к файлу: " + path.toAbsolutePath());
        System.out.println("Абсолютный путь к директории: " + dir.toAbsolutePath());
        System.out.println("Доступен для чтения?: " + Files.isReadable(path));
        System.out.println("Доступен для записи?: " + Files.isWritable(path));
        System.out.println("--------------------------------------------------");

        System.out.println("Методы получения информации о файлах внутри директории");
        Path dir1 = Paths.get("path/paths");
        /*
         создаем директорию paths внутри директории path
         */
        Files.createDirectories(dir1);
        Path target = Paths.get("path");
        /*
         а также по одному файлу внутри каждой из этих директорий
         */
        Path path1 = Path.of("path/paths/path1.txt");
        Files.createFile(path1);
        Path path2 = Path.of("path/path2.txt");
        Files.createFile(path2);
        /*
         newDirectoryStream() возвращает поток, содержащий файлы и директории,без вложенных
         */
        DirectoryStream<Path> paths = Files.newDirectoryStream(target);
        /*
         получаем этот поток и выводим все его элементы.
         */
        paths.forEach(System.out::println);
    }
}
