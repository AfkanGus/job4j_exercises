package ru.job4j.exam.collections.generics;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * 1. Что такое generics?
 */
public class GenericUsage {
    public void printRsl(Collection<?> collection) {
        for (Iterator<?> iterator = collection.iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public void printInfo(Collection<? extends Person> collection) {
        for (Iterator<? extends Person> it = collection.iterator(); it.hasNext(); ) {
            Person next = it.next();
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        List<Person> per = List.of(new Person("name", 21, new Date(913716000000L)));
        new GenericUsage().printInfo(per);

        List<Programmer> pro = List.of(new Programmer("name123", 23, new Date(913716000000L)));
        new GenericUsage().printInfo(pro);
    }
}

