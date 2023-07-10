package ru.job4j.condition;

/**
 * 17. Вывести знак числа.
 * Задание: Написать код, который выводит в
 * консоль одно из слов: "Положительное",
 * "Ноль" или "Отрицательное", в зависимости
 * от значения входящего числа.
 */
public class Task17 {
    public static void signCheck(int number) {
       /* if (number > 0) {
            System.out.println("Положительное");
        } else if (number < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Ноль");
        }*/
        /*String sign = (number == 0) ? "Ноль" : (number > 0) ? "Положительное" : "Отрицательное";
        System.out.println(sign);
        */
       /* switch (Integer.signum(number)) {
            case 1:
                System.out.println("Положительное");
                break;
            case -1:
                System.out.println("Отрицательное");
                break;
            default:
                System.out.println("Ноль");
                break;
        }*/
        String[] sigh = {"Положительное", "Отрицательное", "Ноль"};
        int index = (number > 0) ? 0 : (number < 0) ? 1 : 2;
        System.out.println(sigh[index]);
    }
}
