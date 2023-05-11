package ru.job4j.exam.collections.generics.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Tree<E> {
    boolean add(E parent, E child);

    Optional<Node<E>> findBy(E value);

    boolean isBinary();

    Optional<Node<E>> findByPredicate(Predicate<Node<E>> condition);

    class Node<E> {
        final E value;
        final List<Node<E>> children = new ArrayList<>();

        public Node(E value) {
            this.value = value;
        }
    }
}
