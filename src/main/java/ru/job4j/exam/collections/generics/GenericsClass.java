package ru.job4j.exam.collections.generics;

/**
 *  создать класс общего типа  в <> указать перечень общих типов
 * @param <K>
 * @param <V>
 *     необходимо указать точный параметр, который будет использоваться вместо K и V.
 */
public class GenericsClass<K, V> {
    private K key;
    private V value;

    public GenericsClass(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericsClass{"
                +
                "key=" + key
                +
                ", value=" + value
                +
                '}';
    }

    public static void main(String[] args) {
        GenericsClass<String, String> gen = new GenericsClass<>("First key", "First value");
        System.out.println("Вывод в консоль: " + gen);

        GenericsClass<Integer, String> second = new GenericsClass<>(12345, "Second value");
        System.out.println("Вывод в консоль: " + second);
    }
}
