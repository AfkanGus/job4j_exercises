package ru.job4j;

import java.util.LinkedList;

public class PrioritetOchered {
    private  LinkedList<Zadachi> spisokZadach = new LinkedList<>();

    public void put(Zadachi zadachi) {
        int index = 0;  /*куда вставить задачу, 0 -  нов задача вставл в начало если имеет наивсш приорт*/
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
