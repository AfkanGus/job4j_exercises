package ru.job4j.exam.collections.generics.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*Scanner может задавать систему счисления при чтении чисел.
можно прочитать числа в шестнадцатеричном виде и вывести в десятичном таким образом:
FileOutputStream(file) создает поток для записи данных в файл file с использованием буферизации.
Буферизация означает, что данные сначала записываются во внутренний буфер,
а затем пакетами отправляются на запись в файл. Это может повысить производительность,
так как запись в файл выполняется эффективнее, чем если бы каждый байт записывался отдельно.
Scanner будет ожидать чтения и интерпретации данных в файле как чисел, представленных в шестнадцатеричной форме.
 */
public class ScannerExample3 {
    public static void main(String[] args) throws IOException {
        var data = "A 1B FF 110";
        /*
        создадим временый файл data с префиксом "data",null
         */
        var file = File.createTempFile("data", null);
        /*создадим поток для записи данных в файл с использованием буфера
        данные сначала записываются во внутренний буфер, а затем пакетами отправляются на запись в файл*/
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            out.write(data.getBytes());
        }
        /*
        Создадим scanner для чтения данных из file. и установим систему счисления в шестнадцатиричном формате.
         */
        try (var scanner = new Scanner(file).useRadix(16)) {
            while (scanner.hasNextInt()) {
                System.out.print(scanner.nextInt());
                System.out.print(" ");
            }
        }
    }
}
