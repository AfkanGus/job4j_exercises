package ru.job4j.iterator.container;

public class UserStore implements Store<User> {
    private final Store<User> store = new MemSore<>();

    @Override
    public void add(User model) {
        store.add(model);

    }

    @Override
    public boolean replace(String id, User madel) {
        return store.replace(id, madel);
    }

    @Override
    public boolean delete(String id) {
        return store.delete(id);
    }

    @Override
    public User findById(String id) {
        return store.findById(id);
    }
}
