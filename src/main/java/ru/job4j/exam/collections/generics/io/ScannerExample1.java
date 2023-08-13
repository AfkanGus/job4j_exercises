package ru.job4j.exam.collections.generics.io;

import java.io.CharArrayReader;
import java.util.Scanner;

/**
 * Пусть надо из потока данных вычленить только числа
 */
public class ScannerExample1 {
    public static void main(String[] args) {
        //шаблон разделителя не указан явно
        var ls = System.lineSeparator();
        //есть поток данных,нужно вычленить только число. join -
        //объединяем строки с разделителем ls.
        var data = String.join(ls,
                "1 A 2",
                "3 4 B",
                "C 5 6");
        //получим через сканер буферезированный массив символов
        var scanner = new Scanner(new CharArrayReader(data.toCharArray()));
        //пока есть следующий эл.
        while (scanner.hasNext()) {
            //и если след.ел. инт
            if (scanner.hasNextInt()) {
                //получить этот элемент
                System.out.print(scanner.nextInt());
                // и напечать.
                System.out.print("");
            } else {
                //иначе дальше получать эл.
                scanner.next();
            }
        }
    }
}
