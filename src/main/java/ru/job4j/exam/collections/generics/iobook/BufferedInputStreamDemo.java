package ru.job4j.exam.collections.generics.iobook;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "Это знак авторского права &copy; " + ", а &copy - нет. \n";
        byte[] buf = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked = false;

        try (BufferedInputStream f = new BufferedInputStream(in)) {
            int maxLength = buf.length;
            int bytesRead = 0;
            while ((c = f.read()) != -1 && bytesRead < maxLength) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    case ' ':
                        if (marked) {
                            f.reset();
                            System.out.println("&");
                        } else {
                            System.out.println((char) c);
                        }
                        break;
                    default:
                        System.out.println((char) c);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}