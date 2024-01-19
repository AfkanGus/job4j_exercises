package ru.job4j.exam.collections.generics.hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 3. Inner Join для списков элементов
 * В это задании необходимо вычислить элементы, которые одновременно есть в двух списках чисел.
 * <p>
 * Заданы два списка чисел, нужно вернуть третий список, который будет состоять из таких чисел, которые одновременно
 * есть в обоих списках.
 */
public class Task3 {
    public static List<Integer> extractDuplicates(List<Integer> left, List<Integer> right) {
        HashSet<Integer> leftSet = new HashSet<>(left);
        HashSet<Integer> rightSet = new HashSet<>(right);
        List<Integer> duplicates = new ArrayList<>();
        for (Integer num : leftSet) {
            if (rightSet.contains(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
}
