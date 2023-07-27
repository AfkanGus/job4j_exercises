package type;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Получаем значения катетов и гипотенузы от пользователя
        System.out.print("Введите значение катета A: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение катета B: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение гипотенузы C: ");
        double c;
        c = scanner.nextDouble();

        // Вычисляем периметр и площадь прямоугольного треугольника
        double perimeter = a + b + c;
        double area = (a * b) / 2;

        // Выводим результаты с округлением до одного знака после запятой
        System.out.printf("%.1f%n%.1f", perimeter, area);

        // Закрываем Scanner
        scanner.close();
    }
}
