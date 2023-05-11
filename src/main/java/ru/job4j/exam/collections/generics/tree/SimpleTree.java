package ru.job4j.exam.collections.generics.tree;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.function.Predicate;

public class SimpleTree<E> implements Tree<E> {
    private final Node<E> root;

    public SimpleTree(final E root) {
        this.root = new Node<E>(root);
    }

    public boolean isBinary() {
        return findByPredicate(node -> node.children.size() > 2).isEmpty();
    }

    @Override
    public boolean add(E parent, E child) {
        Optional<Node<E>> parentNode = findBy(parent);
        // ищем узел по значению parent
        if (parentNode.isPresent()) {
            if (findBy(child).isPresent()) {
                // проверяем, что значения child еще нет в дереве
                return false;
            }
            Node<E> childNode = new Node<>(child);
            // создаем новый дочерний узел
            parentNode.get().children.add(childNode);
            // добавляем его в список дочерних узлов родительского узла
            return true;
        }
        return false;
    }

    @Override
    public Optional<Node<E>> findBy(E value) {
        return findByPredicate(node -> node.value.equals(value));
    }

    public Optional<Node<E>> findByPredicate(Predicate<Node<E>> condition) {
        Queue<Node<E>> data = new LinkedList<>();
        data.offer(root);
        while (!data.isEmpty()) {
            Node<E> node = data.poll();
            if (condition.test(node)) {
                return Optional.of(node);
            }
            data.addAll(node.children);
        }
        return Optional.empty();
    }
}
