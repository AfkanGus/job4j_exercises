package ru.job4j.exam.collections.generics.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Config {
    private final String path;
    private final Map<String, String> values = new HashMap<String, String>();

    public Config(final String path) {
        this.path = path;
    }
    /* метод load() по аналогии с методом toString(). Метод load должен загружать пару ключ-значение в Map values.*/
    public void load() {
        try (BufferedReader in = new BufferedReader(new FileReader(this.path))) {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.length() > 0 && line.charAt(0) != '#') {
                    if (!line.contains("=")) {
                        throw new IllegalArgumentException(
                                String.format("Line \"%s\" does not contain the symbol \"=\"", line));
                    }
                    if (line.startsWith("=")) {
                        throw new IllegalArgumentException(
                                String.format("Line \"%s\" does not contain a key", line));
                    }
                    if (line.indexOf("=") == line.length() - 1) {
                        throw new IllegalArgumentException(
                                String.format("Line \"%s\" does not contain a value", line));
                    }

                    String[] map = line.split("=", 2);
                    values.put(map[0], map[1]);
                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    /*  public void load() {
          try (BufferedReader in = new BufferedReader(new FileReader(this.path))) {
              in.lines()
                      .filter(s -> s.length() > 0 && s.charAt(0) != '#')
                      .forEach(str -> {
                          if (!str.contains("=")) {
                              throw new IllegalArgumentException(
                                      String.format("does not contain the symbol \"=\"", str));
                          }
                          if (str.startsWith("=")) {
                              throw new IllegalArgumentException(
                                      String.format("does not contain a key", str));
                          }
                          if (str.indexOf("=") == str.length() - 1) {
                              throw new IllegalArgumentException(
                                      String.format("does not contain a value", str));
                          }

                          String[] map = str.split("=", 2);
                          values.put(map[0], map[1]);
                      });

          } catch (IOException e) {
              e.printStackTrace();
          }
      }*/
    /*метод value(String key) он должен возвращать значение ключа.*/
    public String value(String key) {
        return values.get(key);
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toString();
    }
}

