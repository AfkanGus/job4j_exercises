package ru.job4j.exam.collections.generics.io;

public class CSVReader {
    public static void handle(ArgsName argsName) throws Exception {


    }

    public static void main(String[] args) {
        //валидация принятых параметров
        ArgsName argsName = ArgsName.of(args);
        handle(argsName);
    }
}
