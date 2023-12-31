package ru.job4j.obj;

public class Emunexample {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch (today) {
            case FRIDAY -> {
                System.out.println("It's Friday. Weekend is coming!");
                break;
            }
            case MONDAY -> {
                System.out.println("It's Monday. Have a great start!");
                break;
            }
            case WEDNESDAY -> {
                System.out.println("It's Wednesday. Halfway there!");
                break;
            }
            default -> System.out.println("It's a regular day.");
        }
    }
}
