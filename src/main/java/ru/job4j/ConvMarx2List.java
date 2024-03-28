package ru.job4j;

import java.util.ArrayList;
import java.util.List;

public class ConvMarx2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ConvMarx2List rsl = new ConvMarx2List();
        int[][] in = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = rsl.toList(in);
        System.out.print(result);
    }
}
