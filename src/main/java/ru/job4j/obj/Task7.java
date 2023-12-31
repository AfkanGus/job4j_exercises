package ru.job4j.obj;

/**
 * 6. Объявить класс, переменные, геттеры, конструктор со всеми полями
 * Дан неполный каркас класса Task7.
 * <p>
 * Задание: Объявить класс Task7. Объявить в нём переменные first и second типа
 * int без инициализации. Обе переменные должны быть private и
 * обладать геттерами. Также объявить конструктор со всеми полями.
 */
public class Task7 {
    private int first;
    private int second;

    public Task7(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
