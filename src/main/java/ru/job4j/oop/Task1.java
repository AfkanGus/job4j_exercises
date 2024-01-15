package ru.job4j.oop;

/**
 *  1. Я хотел бы чашечку чая
 * В этом упражнении необходимо создать объект класса Tea в методе main класса Task1.
 * <p>
 * У объекта Tea необходимо вызвать метод prepare. В результаты вызова метода prepare на
 * консоле будет выведена надпись "I would like to drink a
 * cup of tea."
 */
class Tea {
    void prepare() {
        System.out.println("I would like to drink a cup of tea.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();
    }
}
