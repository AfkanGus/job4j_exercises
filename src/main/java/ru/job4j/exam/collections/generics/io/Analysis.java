package ru.job4j.exam.collections.generics.io;

import java.io.*;

public class Analysis {
    public void unavailable(String source, String target) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             PrintWriter writer = new PrintWriter(new FileWriter(target))) {
            String line;
            boolean unavailable = false;
            String startTime = " ";
            while ((line = reader.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(" ");
                String status = parts[0];
                String time = parts[1];
                if (!unavailable && (status.equals("400") || status.equals("500"))) {
                    unavailable = true;
                    startTime = time;
                } else if (unavailable && (status.equals("200") || status.equals("300"))) {
                    unavailable = false;
                    writer.println(startTime + ";" + time + ";");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Analysis analysis = new Analysis();
        analysis.unavailable("data/server.log", "data/target.csv");
    }
}
