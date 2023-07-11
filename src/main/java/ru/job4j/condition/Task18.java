package ru.job4j.condition;

/**
 * 18. Выполнить операции с числом при определенном условии
 * Задание: Написать код, который уменьшает число на единицу,
 * если оно как минимум трехзначное и положительное. Результат вывести в
 * консоль. Если число не проходит по условию, то вывести это же число
 * без изменений.
 */
public class Task18 {
    public static void numDecrease(int number) {
        /*if (number >= 100) {
            int rsl = number - 1;
            System.out.println(rsl);
        } else {
            System.out.println(number);
        }*/
        /*int rsl = (number >= 100) ? number - 1 : number;
        System.out.println(rsl);*/

        /*switch (number >= 100 ? 1 : 0) {
            case 1:
                int rsl = number - 1;
                System.out.println(rsl);
                break;
            default:
                System.out.println(number);
                break;
        }*/
        int counter = number;
        while (number >= 100) {
            counter = number - 1;
            break;
        }
        System.out.println(counter);
    }
}