package ru.job4j.condition;

public class Tour {
    public static String answer(String question) {
        String rsl = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            rsl = "Hi, SmartAss.";
        }
        if ("Bye.".equals(question)) {
            rsl = "See you later.";
        }
        return rsl;
    }
}
