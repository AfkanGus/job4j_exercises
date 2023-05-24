package ru.job4j.exam.collections.generics.map;

public class Ex {
    public static void main(String[] args) {
        int value = 0;
        String result = abs(value);
        String rsl = max(1, 1);
        String rslAbss = abss(0);
        System.out.println(rslAbss);
        int count = 0;
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = count++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String abss(int value) {
        final String result;
        if (value > 0) {
            result = "positive";
        } else if (value == 0) {
            result = "zero";
        } else {
            result = "negative";
        }
        return result;
    }

    public static String abs(int value) {
        final String result;
        if (value == 0) {
            result = "positive";
        } else {
            result = "negative";
        }
        return result;
    }

    public static String max(int left, int right) {
        return left > right ? "great" : "less";
    }
}



