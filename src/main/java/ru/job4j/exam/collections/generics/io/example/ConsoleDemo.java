package ru.job4j.exam.collections.generics.io.example;

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {
    public static void main(String[] args) {
        String login;
        char[] charPassword;
        /* получаем объект Console
         */
        Console console = System.console();
        if (console == null) {
            System.out.println("Конс недост");
            return;
        }
        //read console
        login = console.readLine("%s", "login");
        console.printf("Your login: %s\n", login);
        charPassword = console.readPassword("%s", "Your paswword"); // read password with charecter array
        System.out.println("Your password: " + String.valueOf(charPassword));
        Arrays.fill(charPassword, ' '); // clear password
    }
}
