package ru.job4j.condition;

/**
 * Ниже представлен метод isExist(int num1, int num2),
 * который принимает 2 целых числа - числитель дроби и
 * ее знаменатель соответственно.
 * <p>
 * Задание: Написать код, который выводит в консоль "Да",
 * если дробь существует, иначе "Нет".
 * <p>
 * Примечание: Дробь существует, если ее знаменатель не
 * равен нулю.
 */
public class Task23 {
    public static void isExist(int num1, int num2) {
        String[] in = {"Да", "Нет"};
        int rsl = num2 != 0 ? 0 : 1;
        System.out.println(in[rsl]);
    }
}
