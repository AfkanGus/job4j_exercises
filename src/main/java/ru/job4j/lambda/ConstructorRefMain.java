package ru.job4j.lambda;

public class ConstructorRefMain {
    public static void main(String[] args) {
        /*ссылка на конструктор Model(String str){}*/
        FuncInterface modelConstructor = Model::new;
        /*вызов конструктора класса Model с передачей
         параметра-строки с помощью переменной modelConstructor.*/
        Model model = modelConstructor.function("Example");
        System.out.println("Value =" + model.getName());
    }
}
