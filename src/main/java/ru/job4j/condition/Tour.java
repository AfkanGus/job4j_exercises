package ru.job4j.condition;

public class Tour {
    public static void meny(String name) {
        if ("sm.".equals(name)) {
            System.out.println("start -sm");
        }
        if ("tanks".equals(name)) {
            System.out.println("strat - tanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("start - tetris");
        }
    }

    public static void main(String[] args) {
        Tour.meny("tanks");
    }
}
