package type;

import java.util.Scanner;

/**
 * 2. Создание short переменной
 * В Java есть 8 примитивных типов. short
 * описывает число от числа от -32,768 до 32,767
 * <p>
 * Ниже приведен код. Программа получает от пользователя
 * число в диапазоне short и выводит его на консоль.
 */
public class ShortType {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        short value = in.nextShort();
        System.out.println(value);
    }
}
