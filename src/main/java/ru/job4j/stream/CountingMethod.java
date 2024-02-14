package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 4.1 Группировка элементов и подсчет количества. Метод counting()
 * Метод Collectors.groupingBy() всегда первым параметром принимает функцию, по которой будет строиться ключ. Вторым
 * параметром может принимать Collector. Большинство методов Collectors возвращают Collector.
 * <p>
 * Рассмотрим метод Collectors.counting(), этот метод ничего не принимает, а просто подсчитывает количество элементов
 * определенной группы
 * <p>
 * Например, напишем код, который будет возвращать Map<String, Long> ключ это строка, значение это число ее вхождений
 * в список
 */
public class CountingMethod {
    public static class Company {
        private String name;

        public Company(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public static class Worker {
        private int age;
        private Company company;

        public Worker(int age, Company company) {
            this.age = age;
            this.company = company;
        }

        public int getAge() {
            return age;
        }

        public Company getCompany() {
            return company;
        }
    }

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream().collect(Collectors.groupingBy(w -> w.getCompany().getName(), Collectors.counting()));
    }
}