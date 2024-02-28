package ru.job4j.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 5. Итератор не-null значений [#505081]
 */
public class NonNullIterator implements Iterator<Integer> {
    private Integer[] data;
    private int index;

    public NonNullIterator(Integer[] data) {
        this.data = data;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while (index < data.length && data[index] == null) {
            index++;
        }
        return index < data.length;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return data[index++];
    }
}
   /* private final Iterator<Integer> iterator;

    public NonNullIterator(Integer[] data) {
        Stream<Integer> stream = Arrays.stream(data).filter(x -> x != null);
        this.iterator = stream.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return iterator.next();
    }*/

