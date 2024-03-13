package ru.job4j;

import java.util.ArrayList;

public class PhoneDictionary {
    public ArrayList<Person> personArrayList = new ArrayList<>();

    public void add(Person persons) {
        this.personArrayList.add(persons);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> rsl = new ArrayList<>();
        for (Person persons : personArrayList) {
            if (persons.getPhone().contains(key)
                    || persons.getName().contains(key)
                    || persons.getAddress().contains(key)
                    || persons.getSurname().contains(key)) {
                rsl.add(persons);
            }
        }
        return rsl;
    }
}
