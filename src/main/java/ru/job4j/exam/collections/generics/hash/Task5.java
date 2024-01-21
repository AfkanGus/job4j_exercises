package ru.job4j.exam.collections.generics.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 5. Супер работник
 * Менеджер компании просить написать утилиту, которая будет показывать список сотрудников на которых назначено
 * больше одной задачи.
 * <p>
 * Задан список задач, где поле assign - это ID сотрудник.
 * <p>
 * Необходимо написать метод, который вернет список сотрудников на которых назначено больше одной задачи.
 */

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        Map<Integer, Integer> taskCountMap = new HashMap<>();
        for (Task task : tasks) {
            taskCountMap.put(task.assignId, taskCountMap.getOrDefault(task.assignId, 0) + 1);
        }
        List<Integer> rsl = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : taskCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                rsl.add(entry.getKey());
            }
        }
        return rsl;
    }

   /* Map<Integer, Long> taskCountMap = tasks.stream()
            .collect(Collectors.groupingBy(Task::assignId, Collectors.counting()));

        return taskCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
                .collect(Collectors.toList());

    Set<Integer> uniqueAssignIds = new HashSet<>();
    Set<Integer> repeatedAssignIds = new HashSet<>();

        for (Task task : tasks) {
        if (!uniqueAssignIds.add(task.assignId())) {
            // Если add вернет false, значит assignId уже был добавлен ранее (повторение)
            repeatedAssignIds.add(task.assignId());
        }
    }

        return new ArrayList<>(repeatedAssignIds);
}*/



public record Task(Integer taskId, Integer assignId) {

    }
}
