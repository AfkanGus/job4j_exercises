package ru.job4j;

import java.util.LinkedList;

public class PrioritetOchered {
    private  LinkedList<Zadachi> spisokZadach = new LinkedList<>();

    public void put(Zadachi zadachi) {
        int index = 0;
        for (Zadachi currentZadacha : spisokZadach) {
            if (zadachi.getPrioritet() < currentZadacha.getPrioritet()) {
                break;
            }
            index++;
        }
        this.spisokZadach.add(index, zadachi);
    }

    public Zadachi poluchitZadachu() {
        return spisokZadach.poll();
    }
}
