package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Conf {
    private final String path;
    private final Map<String, String> values = new HashMap<String, String>();

    public Conf(final String path) {
        this.path = path;
    }

    /*Считаем все ключи в value*/
    public void load() {

    }

    public String value(String kye) {
        throw new UnsupportedOperationException("Don't impl this method yet!");
    }

    @Override
    public String toString() {
        StringJoiner output = new StringJoiner(System.lineSeparator());
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path))) {
            reader.lines().forEach(output::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Conf("data/app.properties"));
    }
}
