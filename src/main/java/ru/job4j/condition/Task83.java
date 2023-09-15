package ru.job4j.condition;

/**
 * 83. Тезки и однофамильцы
 * Ниже представлен метод isEquals(String name1, String surname1, String name2, String surname2), который принимает 2
 * пары строк - имя с фамилией первого человека и имя с фамилией второго человека.
 * <p>
 * Задание: Написать код, который определяет, являются ли эти 2 человека:
 * <p>
 * - Тезками, но не однофамильцами (Вывести в консоль "Тезки")
 * <p>
 * - Однофамильцами, но не тезками (Вывести в консоль "Однофамильцы")
 * <p>
 * - И тезками, и однофамильцами (Вывести в консоль "Тезки и однофамильцы")
 * <p>
 * Если совпадений нет - вывести "Совпадений нет".
 * <p>
 * Например, для строк "Иван", "Иванов", "Петр", "Иванов" вывод будет:
 * <p>
 * Однофамильцы
 */
public class Task83 {
    public static void isEquals(String name1, String surname1, String name2, String surname2) {
        boolean areNamesEqual = name1.equals(name2);
        boolean areSurnamesEqual = surname1.equals(surname2);

        if (areNamesEqual && areSurnamesEqual) {
            System.out.println("Тезки и однофамильцы");
        } else if (areNamesEqual) {
            System.out.println("Тезки");
        } else if (areSurnamesEqual) {
            System.out.println("Однофамильцы");
        } else {
            System.out.println("Совпадений нет");
        }
    }
}
