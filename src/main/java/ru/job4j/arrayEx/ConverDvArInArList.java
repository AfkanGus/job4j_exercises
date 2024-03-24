package ru.job4j.arrayEx;

import java.util.ArrayList;
import java.util.List;

// надо конвертировать двойной массив в одинарный
public class ConverDvArInArList {
    //чтоб выводилось 4
    public int getLastElement(int[][] array) {
        int numberOfRows = array.length;
        int lastRows = numberOfRows - 1;
        int numberOfColumns = array[lastRows].length;
        return array[lastRows - 1][numberOfColumns - 1];
    }

    /**
     * public List<Integer> toArray(int[][] array) {
     * List<Integer> tempArray = new ArrayList<>();
     * for (int[] row : array) {
     * for (int cell : row) {
     * tempArray.add(cell);
     * }
     * }
     * return tempArray;
     * }
     */

    public static void main(String[] args) {
        ConverDvArInArList converDvArInArList = new ConverDvArInArList();
        int[][] rsl = {
                {1, 2},
                {3, 4}
        };
        int lastEl = converDvArInArList.getLastElement(rsl);
        System.out.println(lastEl);
        //List<Integer> listInteger = converDvArInArList.toArray(rsl);
        //System.out.println(listInteger);
    }
}
