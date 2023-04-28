package ru.job4j.exam.collections.generics.list;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<>();
        for (Person person : persons) {
            if (person.getSurname().contains(key) || person.getPhone().contains(key)
                    || person.getAddress().contains(key) || person.getName().contains(key)) {
                rsl.add(person);
            }
        }
        return rsl;
    }
}
