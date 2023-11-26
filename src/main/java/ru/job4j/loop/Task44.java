package ru.job4j.loop;

/**
 * 44. Вывести трехзначные числа при некоторых условиях
 * Для целого положительного трехзначного числа определим следующие условия:
 * <p>
 * - Корень 2й степени из произведения данного числа на число, составленное
 * из тех же цифр в обратном порядке -
 * должен являться целым числом. (Например, квадратный корень из 144 * 441 = 252)
 * <p>
 * - Данное число не равно числу, составленному из тех же цифр в
 * обратном порядке.
 * <p>
 * - Данное число не содержит 2 рядом стоящих нулей.
 * <p>
 * Например, числом, соответствующим этим условиям, является число 144.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел все целые
 * трехзначные числа, которые удовлетворяют
 * условиям выше.
 * <p>
 * Вывод должен выглядеть так:
 * <p>
 * 144 169 288 441 528 768 825 867 882 961
 * <p>
 * Примечания:
 * <p>
 * - Для вычисления квадратного корня можно использовать
 * Math.sqrt().
 * <p>
 * - При проверке получившегося корня можно привести его
 * к виду 1.0 * Math.round(с),
 * где с - значение квадратного корня.
 */
public class Task44 {
    public static void loop() {
        StringBuilder str = new StringBuilder();
       /* for (int i = 123; i < 987; i++) {
            int reverse = reverseNumber(i);
            int product = i * reverse;
            double squareRoot = Math.sqrt(product);

            if (isInteger(squareRoot) && i != reverse && !hasConsecutiveZeros(i)) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }

    // Метод для инвертирования числа
    private static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    // Метод для проверки, является ли число целым
    private static boolean isInteger(double num) {
        return num == (int) num;
    }

    // Метод для проверки, содержит ли число два рядом стоящих нуля
    private static boolean hasConsecutiveZeros(int num) {
        String numStr = String.valueOf(num);
        return numStr.contains("00");
    }*/
        for (int i = 123; i < 987; i++) {
            int reverse = 0;
            int num = i;
            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }

            int product = i * reverse;
            double squareRoot = Math.sqrt(product);

            String numStr = String.valueOf(i);
            if (squareRoot == (int) squareRoot && i != reverse && !numStr.contains("00")) {
                str.append(i).append(" ");
            }
        }
        System.out.println(str.toString().trim());
    }
}

