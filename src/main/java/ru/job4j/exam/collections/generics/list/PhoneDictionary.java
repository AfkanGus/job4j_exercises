package ru.job4j.exam.collections.generics.list;

import java.util.ArrayList;

/**
 * 4. Телефонный справочник на базе ArrayList [#41598 #58971].
 */
public class PhoneDictionary {
    /*абоненты в справочнике*/
    private ArrayList<Person> arrayListPerson = new ArrayList<>();

    /*добавляет новых абонентов в список справочнике*/
    public void add(Person person) {
        this.arrayListPerson.add(person);
    }

    /*поиск по ключу нужного абонента в обектах и добавления в список справочника*/
    public ArrayList<Person> find(String key) {
        /* список содержаший контакс с key*/
        ArrayList<Person> rsl = new ArrayList<>();
        /*пройдемся по списку с контактами*/
        for (Person persons : arrayListPerson) {
            /*если какойнибудь из контактов содержит ключевое слово key добавим его в новый список*/
            if (persons.getName().contains(key)
                    || persons.getSurname().contains(key) || persons.getPhone().contains(key)
                    || persons.getAddress().contains(key)) {
                rsl.add(persons);
            }
        }
        return rsl;
    }
}
