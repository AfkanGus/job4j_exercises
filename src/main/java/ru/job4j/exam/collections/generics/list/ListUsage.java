package ru.job4j.exam.collections.generics.list;

import java.util.*;

public class ListUsage {
    @SuppressWarnings("checkstyle:MethodLength")
    public static void main(String[] args) {
       /* Для добавления новых элементов предназначены 4 метода:
        1.1. boolean add(E e) – добавляет элемент e в конец списка.*/
        List<String> rsl = new ArrayList<>();
        rsl.add("one");
        rsl.add("two");
        rsl.add("three");
/*
1.2. void add(int index, E element) – добавляет указанный элемент
(element) в указанную позицию(index) в списке.
*/
        rsl.add(0, "four");
       /* 1.3. boolean addAll(Collection<? extends E> c) – добавляет все элементы из переданной коллекции в
         конец списка в том порядке, в котором они возвращаются итератором переданной коллекции.*/
        List<String> list = new ArrayList<>();
        list.add("four");
        list.add("five");
        rsl.addAll(2, list);
        for (String s : rsl) {
            System.out.println("Текущий элемент: " + s);
        }
        System.out.println("Прочитать элементы из списка можно двумя способами:\""
                + " 2.1. Использование метода get():");
        for (int i = 0; i < rsl.size(); i++) {
            System.out.println("Текущий элемент: " + rsl.get(i));
        }
        System.out.println("2.2. использовать итератор для доступа к элементам."
                +
                " Для того чтобы получить экземпляр итератора в интерфейсе List<E> определены 3 метода:\n"
                +
                "        Iterator<E> iterator() – метод возвращает объект Iterator, который содержит в\n"
                +
                "         себе все элементы исходной коллекции.");
        Iterator<String> iterator = rsl.iterator();
        while (iterator.hasNext()) {
            System.out.println("Текущий элемент: " + iterator.next());
        }
        System.out.println("ListIterator<E> listIterator() – возвращает итератор списка для элементов в этом списке.");
        ListIterator<String> listIterator = rsl.listIterator();
        while (listIterator.hasNext()) {
            System.out.println("Текущий элемент: " + listIterator.next());
        }
        System.out.println("ListIterator<E> listIterator(int index) – возвращает итератор списка для элементов"
                + " в этом списке, начиная с элемента индекс которого равен index.");
        ListIterator<String> listIterator1 = rsl.listIterator(5);
        while (listIterator1.hasNext()) {
            System.out.println("Текущий элемент: " + listIterator1.next());
        }
        /*
3. Изменение элементов в списке

E set(int index, E element) – заменяет элемент позиция которого равна index на элемент
 который мы передаем в метод (element). При этом метод возвращает старое значение элемента
  с индексом index.
         */
        List<String> rsl1 = new ArrayList<>();
        rsl1.add("one");
        rsl1.add("two");
        rsl1.add("three");
        rsl1.set(1, "two and second");
        for (String s : rsl1) {
            System.out.println("Текущий элемент: " + s);
        }
        /*
        default void replaceAll(UnaryOperator<E> operator) – заменяет каждый элемент
         в списке результатом применения оператора (operator) к каждому элементу.
         */
        List<String> rsl2 = new ArrayList<>();
        rsl2.add("one");
        rsl2.add("two");
        rsl2.add("three");
        rsl2.replaceAll(String::toUpperCase);
        for (String s : rsl2) {
            System.out.println("Текущий элемент: " + s);
        }
        System.out.println("---");
        /*
        4. Удаление элементов из списка
        Для выполнения данной операции в интерфейсе List<E> определены 5 методов:
         */
        List<String> rsl3 = new ArrayList<>();
        rsl3.add("one");
        rsl3.add("two");
        rsl3.add("three");
        /*
        E remove(int index) – удаляет элемент из списка по индексу index, при этом метод
         возвращает удаленный элемент.
         */
        rsl3.remove(1);
        for (String s : rsl3) {
            System.out.println("Текущий элемент: " + s);
        }
        System.out.println("---");
        /*
        . boolean remove(E e) – удаляет элемент е типа E из коллекции при его
         ПЕРВОМ вхождении в список, если он есть в коллекции.
         */
        rsl3.remove("three");
        for (String s : rsl3) {
            System.out.println("Текущий элемент: " + s);
        }
        System.out.println("---");
        /*
        boolean removeAll(Collection<?> col) – метод удаляет из списка все элементы,
         которые содержатся в коллекции col, если в результате работы метода исходный
          список изменился - метод возвращает true.
         */
        List<String> list2 = new ArrayList<>();
        list2.add("one");
        list2.add("three");
        list2.removeAll(list2);
        for (String s : list2) {
            System.out.println("Текущий элемент: " + s);
        }
        System.out.println("-----");
        /*
         boolean retainAll(Collection<?> col) – метод также удаляет элементы из списка,
          за исключением тех, которые находятся в коллекции col, если в результате
           работы метода исходный список изменился - метод возвращает true.
         */
        List<String> list4 = new ArrayList<>();
        list4.add("one");
        list4.add("three");
        list4.retainAll(rsl);
        for (String s : list4) {
            System.out.println("Текущий элемент: " + s);
        }
        /*
 default boolean removeIf(Predicate<? super E> filter) – метод удаляет все элементы из коллекции,
  которые удовлетворяют условию определенному в предикате filter(передается в виде лямбда выражения).
   Если в результате работы метода список изменился - метод возвращает true.
         */
        List<String> words = new ArrayList<>();
        words.add("кот");
        words.add("собака");
        words.add("слон");
        words.add("мышь");
        words.add("хомяк");
        words.removeIf(s -> s.length() <= 3);
        System.out.println(words);

    /*
    . boolean contains*(E element) – метод возвращает true, если список содержит
     переданный в метод элемент element.
     */
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        boolean b = numbers.contains(2);
        System.out.println("Список содержит элемент: " + b);
        System.out.println("------------");
        /*
        int indexOf*(E element) – метод возвращает индекс элемента element при его
         первом вхождении в список. Если элемент не найден - метод возвращает -1.
         */
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        int i = strings.indexOf("two");
        System.out.println("Индекс элемента в списке: " + i);
        System.out.println("----------");
        /*
        int lastIndexOf*(E element) - метод возвращает индекс элемента element
         при его последнем вхождении в список. Если элемент не найден - метод возвращает -1.
         */
        List<String> str = new ArrayList<>();
        str.add("two");
        str.add("three");
        str.add("one");
        int index = str.lastIndexOf("one");
        System.out.println("ндекс элемента в списке: " + index);
        System.out.println("----");
        /*
         List<E> subList(int fromIndex, int toIndex) - метод возвращает список, который содержит
          все элементы исходного списка начиная с индекса fromIndex(включительно)
           и до toIndex(значение исключается). При этом, если выполняется условие
            fromIndex == toIndex,- метод вернет пустой список.
         */
        List<String> strings2 = new ArrayList<>();
        strings2.add("one");
        strings2.add("two");
        strings2.add("three");
        strings2.add("four");
        strings2.add("five");
        List<String> newlist = strings2.subList(1, 2);
        for (String s : newlist) {
            System.out.println("екущий элемент: " + s);
        }
        System.out.println("----------");
        /*
        . default void sort(Comparator<? super E> comp) – метод осуществляет сортировку
         списка в соответствии с компаратором comp, который мы передаем в метод.
         */
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(5);
        numbers1.add(2);
        numbers1.add(8);
        numbers1.add(1);
        numbers1.sort(Comparator.reverseOrder());
        System.out.println(numbers1);

    }
}