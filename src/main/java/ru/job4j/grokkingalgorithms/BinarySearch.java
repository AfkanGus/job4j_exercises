package ru.job4j.grokkingalgorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] myList = {
                87, 23, 34, 56
        };
    }

    public static boolean guessLessThanItem(int guess, int item) {
        if (guess > item) {
            return false;
        }
        return true;
    }
}
