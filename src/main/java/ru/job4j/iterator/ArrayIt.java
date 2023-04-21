package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Сделаем итератор для одномерного массива чисел.
 */
public class ArrayIt implements Iterator<Integer> {
    private final int[] data;
    private int point = 0;

    public ArrayIt(int[] data) {
        this.data = data;
    }

    /*
    д hasNext() возвращал true до тех пор,
    пока в массиве есть следующий элемент,
    можно использовать поле point, которое
    будет хранить текущую позицию в массиве.
     */
    @Override
    public boolean hasNext() {
        return point < data.length;
    }

    /*
    А метод next() должен возвращать текущий
    элемент массива и сдвигать указатель point на
    следующую позицию.
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[point++];
    }
}
