package ru.job4j.exam.collections.generics.io;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        /*Нужно из потока данных вычленить адреса почты*/
        var data = "empl1@mail.ru, empl2@mail.ru, empl3@mail.ru";
        var scanner = new Scanner(new ByteArrayInputStream(data.getBytes()))
                .useDelimiter(", ");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}

