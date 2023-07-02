package ru.job4j.exam.collections.generics.io;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        //нужно из потока данных вычленить адреса почты,разделенные между собой","
        var data = "example1@bk.ru,example2@bk.ru,example3@bk.ru";
        //получим через сканер массив входящих байтов разделенных запятой.
        var scanner = new Scanner(new ByteArrayInputStream(data.getBytes())).useDelimiter(",");
        while (scanner.hasNext()) {
            //если имеется данные, выводить на печать последующие данные
            System.out.println(scanner.next());
        }
    }
}
