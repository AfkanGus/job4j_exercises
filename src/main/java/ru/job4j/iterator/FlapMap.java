package ru.job4j.iterator;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/*
     StrimAPI - flapMap -получить из элемента потока
     другой поток.
     */
public class FlapMap<T> implements Iterator<T> {
    /*
    каждый элемент в data - является итератором,который может перебирать
    объеты типа Т.
     */
    private final Iterator<Iterator<T>> data;
    /*
    текущий итератор на пустой итератор
     */
    private Iterator<T> cursor = Collections.emptyIterator();

    /*
    В конструктор передаются объект типа Iterator<Iterator<T>> data
     */
    public FlapMap(Iterator<Iterator<T>> data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        /*
         если у cursor нет элементов и если в data еще есть другие итераторы
         */
        while (!cursor.hasNext() && data.hasNext()) {
/*
то мы переключаем cursor на следующий итератор из data,
 вызывая метод data.next()
 */
            cursor = data.next();
        }
        return cursor.hasNext();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return cursor.next();
    }

    public static void main(String[] args) {
        Iterator<Iterator<Integer>> data = List.of(
                List.of(1, 2, 3).iterator(),
                List.of(4, 5, 6).iterator(),
                List.of(7, 8, 9).iterator()
        ).iterator();
        FlapMap flap = new FlapMap(data);
        while (flap.hasNext()) {
            System.out.println(flap.next());
        }
    }
}
