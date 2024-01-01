package ru.job4j.obj;

/**
 * 7. Объявить класс, переменные, геттеры, конструктор с выборочными полями
 * Дан неполный каркас класса Task6.
 * <p>
 * Задание: Объявить класс Task6. Объявить в нём переменную age типа int со значением 20 и переменные name и surname типа String без инициализации.
 * Все переменные должны быть private и обладать геттерами. Также объявить конструктор без параметров и конструктор с полями name и surname.
 */
public class Task6 {
    private int age = 20;
    private String name;
    private String surname;

    public Task6() {

    }

    public Task6(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
