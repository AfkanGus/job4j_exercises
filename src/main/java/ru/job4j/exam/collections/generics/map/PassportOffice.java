package ru.job4j.exam.collections.generics.map;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizenMap = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizenMap.containsKey(citizen)) {
            citizenMap.put(citizen.getPassport(), citizen);
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizenMap.get(passport);
    }
}
