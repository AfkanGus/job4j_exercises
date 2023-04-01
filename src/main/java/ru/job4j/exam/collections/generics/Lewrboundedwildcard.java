package ru.job4j.exam.collections.generics;

import java.util.ArrayList;
import java.util.List;

public class Lewrboundedwildcard {
    public void addAll(List<? super Integer> list) {
        for (int i = 1; i < 5; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<? super Integer> list = new ArrayList<>();
        new Lewrboundedwildcard().addAll(list);
    }
}
