package ru.job4j.exam.collections.generics.list;

import java.util.ArrayList;

public class IntoArraylist<E> {
    private int size;

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7, 100);
        System.out.println(list);

    }
}
