package ru.job4j.loop;

/**
 * 5. Вывести стоимость конфет за килограмм
 * Дано целое число price — цена 1 кг конфет.
 * Вывести стоимость 1, 2, . . . , 5 кг конфет.
 */
public class SweetPrice {
    public static void out(int price) {
        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println(price);
                    break;
                case 2:
                    System.out.println(price * 2);
                    break;
                case 3:
                    System.out.println(price * 3);
                    break;
                case 4:
                    System.out.println(price * 4);
                    break;
                case 5:
                    System.out.println(price * 5);
                    break;
                default:
            }
        }
            /* int[] prices = new int[5];
        for (int kg = 1; kg <= 5; kg++) {
            prices[kg - 1] = price * kg;
            System.out.println(prices[kg-1]);
        }*/
       /* for(int index = 1; index <= 5; index++){
            System.out.println(index*price);
        }*/
    }
}
