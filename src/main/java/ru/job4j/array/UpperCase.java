package ru.job4j.array;

import java.util.Arrays;

public class UpperCase {
    public static char[] onlyLowCase(char[] input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : input) {
            if (Character.isLowerCase(ch)) {
                stringBuilder.append(Character.toUpperCase(ch));
            }
        }
        return stringBuilder.toString().toCharArray();

      /*  char[] rsl = new char[input.length];
        int i = 0;
        for (char ch : input) {
            if (Character.isLowerCase(ch)) {
                rsl[i++] = Character.toUpperCase(ch);
            }
        }
        return Arrays.copyOf(rsl, i);*/
    }
}
