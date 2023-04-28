package ru.job4j.exam.collections.generics.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FullSearch {
    public static Set<String> extractNumber(List<Task> list) {
        Set<String> listTasks = new HashSet<>();
        for (Task listTask : list) {
            listTasks.add(listTask.getNumber());
        }
        return listTasks;
    }
}
