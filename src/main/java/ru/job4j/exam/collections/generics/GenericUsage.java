package ru.job4j.exam.collections.generics;

import java.util.*;

/**
 * 1. Что такое generics?
 */
public class GenericUsage {
    /*
     работает без ограничений, т.е. в него можно передавать
      коллекцию, которая хранит любые типы.
     */
    public void printRsl(Collection<?> collection) {
        for (Iterator<?> iterator = collection.iterator();
             iterator.hasNext();
        ) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    /*
     создадим метод который позволит вывести в консоль все элементы коллекции
     , которая может содержать объекты Person или объекты класса Programmer:
     */
    public void printInfo(Collection<? extends Person> collection) {
        for (Iterator<? extends Person> it = collection.iterator();
             it.hasNext();
        ) {
            Person next = it.next();
            System.out.println(next);
        }
    }

    /*
     мы хотим написать метод, который помещает объекты Integer в список и выводит этот
      список в консоль. При этом наш метод должен быть более гибки
      м и работал не только с типом Integer, но и с его суперклассами (т.е. Number и Object).
     */
    public void addAll(List<? super Integer> list) {
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println("Текущий элемент: " + o);
        }
    }

    public static void main(String[] args) {
        List<Person> per = List.of(new Person("name",
                21, new Date(913716000000L)));
        new GenericUsage().printInfo(per);

        List<Programmer> pro = List.of(new Programmer("name123",
                23, new Date(913716000000L)));
        new GenericUsage().printInfo(pro);
        List<? super Integer> list = new ArrayList<>();
        new GenericUsage().addAll(list);
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        new GenericUsage().printRsl(l);
    }
}

