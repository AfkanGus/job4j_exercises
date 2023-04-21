package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 Создать итератор, возвращающий только четные цифры.
 */
public class EvenNumbersIterator implements Iterator<Integer> {
    private int[] data;
    private int index;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        /*
        условие - index тек.элемент. не превышает длинмассива
        или значение текущего элемента не содержат  четнчисла.
         */
        while (index < data.length && data[index] % 2 != 0) {
            index++;
        }
        return index < data.length && data[index] % 2 == 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return data[index++];
    }
}
