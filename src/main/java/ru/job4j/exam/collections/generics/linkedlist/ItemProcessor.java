package ru.job4j.exam.collections.generics.linkedlist;

import java.util.LinkedList;

public class ItemProcessor {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();
        list.add("0");
        list.add("1");
        list.remove(1);
        for (String s : list) {
            System.out.println(s);

        }
    }
}
