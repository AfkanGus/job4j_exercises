package ru.job4j.exam.collections.generics.linkedlist;

import java.util.Random;

public class LinList {
    private Random random = new Random();

    public static void main(String[] args) {
        LinList list = new LinList();
        list.loadData();
    }

    public void loadData() {
        int[] values = {1, 2, 3, 20};
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0xFFFF) {
                break;
            }
            values[i] = nextValue();
            System.out.println(values[i]);
        }
    }

    private int nextValue() {
        return random.nextInt(5);
    }

    private void processItems(int[] values) {
        System.out.println("Result");
        for (int value : values) {
            System.out.println(value);
        }
    }
}
