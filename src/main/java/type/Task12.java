package type;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inches = in.nextInt();
        double inch = (double) inches;
        double inchSum = inch * 2.54;
        String rsl = String.format("%.2f", inchSum, System.lineSeparator()).replace(',', '.');
        System.out.printf(rsl);
    }
}
