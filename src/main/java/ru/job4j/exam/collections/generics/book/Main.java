package ru.job4j.exam.collections.generics.book;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        try {
            ClassLoader classLoader = Main.class.getClassLoader();
            Class<?> clazz = classLoader.loadClass("com.example.MyClass");
            MyClass instance = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
