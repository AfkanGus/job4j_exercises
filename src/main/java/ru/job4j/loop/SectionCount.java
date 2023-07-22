package ru.job4j.loop;

/**
 * 11. Найти количество отрезков, используя цикл
 * Даны два целых положительных числа length, section.
 * length это расстояние. Вам нужно не используя операцию
 * <p>
 * деления найти сколько раз отрезок длиной section помещает
 * в length. Нужно использовать цикл while
 * <p>
 * Например,
 * <p>
 * Для length = 2, section = 1 => 2
 * <p>
 * Для length = 3, section = 2 => 1
 */
public class SectionCount {
    public static int count(int length, int section) {
        int count = 0;
        while (length >= section) {
            section += section;
            count++;
        }
        return count;
    }
}
