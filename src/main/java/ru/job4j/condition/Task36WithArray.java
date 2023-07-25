package ru.job4j.condition;

public class Task36WithArray {
    public static void sameNums(int number) {
        String nameStr = String.valueOf(number);
        char[] charStr = nameStr.toCharArray();
        boolean isSame = true;
        for (int i = 1; i < charStr.length; i++) {
            if (charStr[i] != charStr[0]) {
                isSame = false;
                break;
            }
        }
        if (isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        sameNums(12);
    }
}
