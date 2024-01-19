package ru.job4j.exam.collections.generics.hash;
/**
 * 4. Outer full join для массивов чисел.
 * В это задании необходимо вычислить уникальный элементы, которые есть в двух массивах чисел.
 * <p>
 * Заданы два массива чисел, нужно вернуть третий массив, который будет состоять только из уникальных элементов,
 * которые есть в двух массивах.
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static List<Integer> extractUnique(List<Integer> left, List<Integer> right) {
        Set<Integer> leftSet = new HashSet<>(left);
        Set<Integer> rightSet = new HashSet<>(right);
        //*Создаем копии множеств, чтобы не изменять оригинальные множества*//*
        Set<Integer> leftCopy = new HashSet<>(leftSet);
        Set<Integer> rightCopy = new HashSet<>(rightSet);
        leftCopy.removeAll(rightSet);
        rightCopy.removeAll(leftSet);
        Set<Integer> result = new HashSet<>(leftCopy);
        result.addAll(rightCopy);
        return new ArrayList<>(result);
    }
}
