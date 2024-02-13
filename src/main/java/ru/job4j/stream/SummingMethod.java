package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 4.2. Группировка элементов и сумма. Метод summigtInt()
 * Если нам нужно подсчитать сумму элементов при группировке, то можем использовать коллектор Collectors.summingInt(), этот коллектор суммирует в
 * int. Он принимает функцию в которой мы должны преобразовать наш объект к int
 * Вам дан список пользователей, у каждого пользователя есть счет. Ваша задача найти сумму баланса для каждого пользователя.
 * <p>
 * Подсказка: нужно использовать вспомогательный класс для группировки Pair
 */
public class SummingMethod {
    static class User {
        private String name;
        private List<Bill> bills = new ArrayList<>();

        public User(String name, List<Bill> bills) {
            this.name = name;
            this.bills = bills;
        }
    }

    static class Bill {
        private int balance;

        public Bill(int balance) {
            this.balance = balance;
        }

        public int getBalance() {
            return balance;
        }
    }

    private static class Pair {
        private User user;
        private Bill bill;

        public Pair(User user, Bill bill) {
            this.user = user;
            this.bill = bill;
        }

        public User getUser() {
            return user;
        }

        public Bill getBill() {
            return bill;
        }
    }

    public static Map<String, Integer> summing(List<User> users) {

    }
}
