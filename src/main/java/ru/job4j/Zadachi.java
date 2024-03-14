package ru.job4j;

/**
 * 5. Очередь с приоритетом на LinkedList [#41670 #58972]
 */
public class Zadachi {
    private String opisanieZadachi;
    private int prioritetZadachi;

    public Zadachi(String opisanieZadachi, int prioritet) {
        this.opisanieZadachi = opisanieZadachi;
        this.prioritetZadachi = prioritet;
    }

    public String getOpisanieZadachi() {
        return opisanieZadachi;
    }

    public void setOpisanieZadachi(String opisanieZadachi) {
        this.opisanieZadachi = opisanieZadachi;
    }

    public int getPrioritet() {
        return prioritetZadachi;
    }

    public void setPrioritet(int prioritet) {
        this.prioritetZadachi = prioritet;
    }
}
