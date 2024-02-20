package ru.job4j.array;

/**
 * 20. Выручка автопарка
 * Транспортная компания осуществляет работу 3 маршрутов городских автобусов. В конце каждого дня регистрируется
 * выручка по каждому из маршрутов. Ниже представлен метод array(int[] arr), который принимает 3 массива целых чисел
 * - выручки этих маршрутов за 3 дня соответственно.
 * <p>
 * Задание: написать код, который считает и выводит в консоль поступления за 3 дня от каждого из этих маршрутов в
 * виде: "Первый: х, второй: х, третий: х".
 * <p>
 * Например, для массивов значений [10, 20, 30],
 * [10, 20, 30],
 * [10, 20, 30] вывод должен быть:
 * <p>
 * Первый: 30, второй: 60, третий: 90
 */
public class Task77 {
    public static void array(int[] first, int[] second, int[] third) {
        int[] rsl = new int[first.length];
 /*       int i = 0;
        for (int day : first) {
            int sum = day + second[i] + third[i];
            rsl[i++] = sum;
        }*/
        for (int i = 0; i < first.length; i++) {
            rsl[i] = first[i] + second[i] + third[i];
        }
        System.out.printf("Первый: %s, второй: %s, третий: %s%n", rsl[0], rsl[1], rsl[2]);
    }

    public static void main(String[] args) {
        int[] first = {10, 20, 30};
        int[] second = {10, 20, 30};
        int[] third = {10, 20, 30};
        array(first, second, third);
    }
}

