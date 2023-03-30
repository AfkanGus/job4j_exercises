package type;

import java.util.Scanner;

/**
 * 10. Преобразовать градусы Фаренгейта в градусы Цельсия.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fahrenheit = input.nextInt();
        double celsius = 5.0 * (fahrenheit - 32.0) / 9.0;
        String rsl = String.format("%.1f", celsius, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
