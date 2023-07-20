package ru.job4j.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws IOException {
        int c;
        /*создаем соединение с сервером.(internic. net -
это сайт веб-службы InteгNIC, обрабатывающей запросы по протоколу whois;
а порт 43 предназначен именно для этой службы) */
        try (Socket s = new Socket("whois.internic.net", 43)) {
            /*в сокете открываем поток ввода вывода*/
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            /*сформируем строку запроса*/
            String str = (args.length == 0 ? "youtube.com" : args[0]) + "\n";
            /*преобразуем строку запроса в байты*/
            byte[] buf = str.getBytes();
            /*пошлем запрос*/
            out.write(buf);
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
       // s.close - сокет закрывается в ручную
        // Использовать блок оператора try с ресурсами для закрытия сокета
    }
}
