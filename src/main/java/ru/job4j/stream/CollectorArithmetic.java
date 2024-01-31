package ru.job4j.stream;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorArithmetic {
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new; /*поставщик создающий новый обект LinkedList<Integer> */
        BiConsumer<List<Integer>, Integer> consumer = List::add; /*- потребитель добавляет новые элементы в список.*/
        BinaryOperator<List<Integer>> merger = (xs, ys) -> { /* объединитель, который объединяет два списка.*/
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> { /* функция, которая преобразует список в целое число.*/
        /*    int number = 100;
            for (Integer n : ns) {
                number /= n;
            }
            return number;*/
            int rsl = 1;
            for (Integer n : ns) {
                rsl *= n;
            }
            return rsl;
        };
     /*   Integer rsl = List.of(2, 5, 10).stream()
                .collect(Collector.of(supplier, consumer, merger, function)); *//*для преобразования элементов потока в определенный тип коллекции*//*
        System.out.println(rsl);*/
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
