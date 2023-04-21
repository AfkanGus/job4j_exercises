package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Тератор должен отдавать элементы в обратном порядке.
 * Надо изменить порядок прохода элемнетов.
 */
public class BackwardArrayIt implements Iterator<Integer> {
    private final int[] data;
    private int point;

    public BackwardArrayIt(int[] data) {
        this.data = data;
        this.point = data.length - 1;
    }

    @Override
    public boolean hasNext() {
        /*
        ищет элементы в обратном порядке.
         */
        return point >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        /*
        возвращает текущий элемент и переходит к следующиму.
         */
        return data[point--];
    }
}
