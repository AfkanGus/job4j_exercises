package ru.job4j.exam.collections.generics.list;

import java.util.*;

public class SimpleArrayList<T> implements SimpleList<T> {
    private T[] container;

    private int size = 0;

    private int modCount;

    public SimpleArrayList(int capacity) {
        this.container = (T[]) new Object[capacity];
    }

    private void grow() {
        if (container.length == 0) {
            container = Arrays.copyOf(container, 1);
        }
        container = Arrays.copyOf(container, container.length * 2);
        modCount++;
    }

    @Override
    public void add(T value) {
        if (size == container.length) {
            grow();
        }
        container[size++] = value;
        modCount++;
    }

    @Override
    public T set(int index, T newValue) {
        T prevValue = get(index);
        container[index] = newValue;
        return prevValue;
    }

    @Override
    public T remove(int index) {
        T prevIndex = get(index);
        System.arraycopy(container, index + 1, container,
                index, size - index - 1);
        container[--size] = null;
        modCount++;
        return prevIndex;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return container[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int cursor = 0;
            final int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException();
                }
                return cursor < size;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return container[cursor++];
            }
        };
    }
}


