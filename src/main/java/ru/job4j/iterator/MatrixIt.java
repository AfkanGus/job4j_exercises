package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIt implements Iterator<Integer> {
    private final int[][] data;
    private int row = 0;
    private int colum = 0;

    public MatrixIt(int[][] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        /*
         находится ли текущий элемент внутри границ двумерного массива
         */
        while (row < data.length && colum == data[row].length) {
            /*
             переменная row инкрементируется,
             чтобы перейти на следующую строку
             */
            row++;
            /*
             переменная colum сбрасывается в 0, чтобы начать
              перебор следующей строки с первого элемента.
             */
            colum = 0;
        }
        return row < data.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[row][colum++];
    }
}
