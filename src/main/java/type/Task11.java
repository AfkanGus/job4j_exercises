package type;
/**
 * 11. Преобразовать сантиметры в дюймы.
 */

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int centimeters = input.nextInt();
        double cen = (double) centimeters;
        double ce = cen / 2.54;
        String rsl = String.format("%.2f", ce, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
