package ru.job4j.loop;

/**
 * 26. Вывести числа в арифметической прогрессии по убыванию
 * Ниже представлен метод loop(int num), который принимает целое положительное число.
 * <p>
 * Задание: Написать код, который выводит в консоль через пробел в убывающем
 * порядке серию чисел в виде арифметической прогрессии в количестве
 * членов равном 2 * входящее число, начиная с нуля. Разница между соседними
 * членами этой прогрессии должна быть равна 8.
 * <p>
 * Например, для числа 2 вывод будет:
 * <p>
 * 0 -8 -16 -24
 * Например, для числа 1 вывод будет:
 * <p>
 * 0 -8
 * Например, для числа 3 вывод будет:
 * <p>
 * 0 -8 -16 -24 -32 -40
 */
public class Task26 {
    public static void loop(int num) {
        int startValue = 0;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 2 * num; i++) {
            result.append(startValue);

            if (i < 2 * num - 1) {
                result.append(" ");
            }

            startValue -= 8;
        }
        System.out.print(result + System.lineSeparator());
    }
}

