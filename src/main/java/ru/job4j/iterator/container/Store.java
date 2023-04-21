package ru.job4j.iterator.container;

public interface Store<T extends Base> {
    void add(T model);

    boolean replace(String id, T madel);

    boolean delete(String id);

    T findById(String id);
}
