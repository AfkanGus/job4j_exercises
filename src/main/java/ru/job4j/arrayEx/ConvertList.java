package ru.job4j.arrayEx;

import java.util.ArrayList;
import java.util.List;

//8. Конвертация листа массивов в один лист Integer [#10037 #58973]
//Преобразовать список массива чисел в список чисел.
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> listInteger = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                listInteger.add(cell);
            }
        }
        return listInteger;
    }

    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1});
        list.add(new int[]{2, 3});
        List<Integer> result = ConvertList.convert(list);
        System.out.println(result);

    }
}
