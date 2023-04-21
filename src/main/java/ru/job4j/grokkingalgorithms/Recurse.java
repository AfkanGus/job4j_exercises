package ru.job4j.grokkingalgorithms;

public class Recurse {
    public static void main(String[] args) {
        System.out.println(fiNaive(5));
        System.out.println(fiNaive(10));
    }

    private static int fiNaive(int n) {
        if (n <= 1) {
            return n;
        }
        return fiNaive(n - 1) + fiNaive(n - 2);
    }
}


