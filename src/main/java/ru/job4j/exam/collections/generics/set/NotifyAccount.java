package ru.job4j.exam.collections.generics.set;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            if (!accounts.equals(account)) {
                rsl.add(account);
            }
        }
        return rsl;
    }
}
