package type;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Получаем исходные данные от пользователя
        System.out.print("Введите сумму исходной валюты: ");
        int originalCurrency = scanner.nextInt();

        System.out.print("Введите банковский курс: ");
        double exchangeRate = scanner.nextDouble();

        // Вычисляем результат преобразования валюты
        double convertedCurrency = originalCurrency * exchangeRate;

        // Выводим результат с округлением до двух знаков после запятой
        System.out.printf("%.2f", convertedCurrency);

        // Закрываем Scanner
        scanner.close();
    }
}
