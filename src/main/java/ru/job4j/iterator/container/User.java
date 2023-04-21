package ru.job4j.iterator.container;

public class User extends Base {
    private final String username;

    public User(String id, String username) {
        super(id);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
