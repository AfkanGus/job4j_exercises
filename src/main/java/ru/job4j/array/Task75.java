package ru.job4j.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * 13. Определить количество каждой из цифр в массиве
 * Ниже представлен метод array(int[] arr), который принимает массив целых чисел от 1 до 9. Цифры могут содержаться в массиве в разном количестве и
 * порядке, а также могут отсутствовать.
 * <p>
 * Задание: написать код, который определяет следующее:
 * <p>
 * - Сколько раз каждая из цифр встречается в массиве.
 * <p>
 * - Какая цифра (цифры) встречается в массиве чаще всего.
 * <p>
 * - Какая цифра (цифры) вообще не встречается в серии.
 * <p>
 * - Какая цифра (цифры) встречается в массиве реже всего.
 * <p>
 * Чаще - это если цифра присутствует больше раз, чем остальные (3, 3, 3, 2, 2, 1 - здесь чаще 3. А случае 3, 3, 2, 2, 1 - чаще 3 и 2). Реже - это
 * если цифра присутствует меньше раз, чем остальные, но не менее одной (3, 3, 3, 2, 2, 1 - здесь реже 1). Если массив состоит из значений только
 * одной цифры, значит она не чаще, и не реже Например (1, 1). Если массив (1, 1, 2) значит 1 - чаще, 2 - реже.
 * <p>
 * Результат нужно вывести в консоль в 2 строки. Вывод должен иметь вид:
 * <p>
 * "1: х, 2: х, 3: х, 4: х, 5: х, 6: х, 7: х, 8: х, 9: х" - первая строка. х - полученные значения.
 * <p>
 * "Чаще: хуz, отсутствует: хуz, реже: хуz" - вторая строка. х, у, z - полученные значения без пробела в порядке возрастания.
 * <p>
 * Если требуемые для вывода цифры отсутствуют, вывести вместо значения ноль.
 * <p>
 * Например, для массива значений [1, 2, 2, 4, 5, 2, 7, 8, 7] вывод должен быть:
 * <p>
 * 1: 1, 2: 3, 3: 0, 4: 1, 5: 1, 6: 0, 7: 2, 8: 1, 9: 0
 * <p>
 * Чаще: 2, отсутствует: 3 6 9, реже: 1 4 5 8
 */
public class Task75 {
    public static void array(int[] arr) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int number : arr) {
            Integer value = temp.getOrDefault(number, 0);
            temp.put(number, value + 1);
        }
        StringJoiner first = new StringJoiner(", ");
        for (int i = 1; i < 10; i++) {
            StringBuilder builder = new StringBuilder();
            builder
                    .append(i)
                    .append(": ")
                    .append(temp.getOrDefault(i, 0));
            first.add(builder);
        }
        System.out.println(first);

        int max = Collections.max(temp.values());
        int min = Collections.min(temp.values());
        StringJoiner often = new StringJoiner(" ");
        StringJoiner notUse = new StringJoiner(" ");
        StringJoiner rare = new StringJoiner(" ");
        for (int i = 1; i < 10; i++) {
            Integer number = temp.getOrDefault(i, 0);
            if (number == 0) {
                notUse.add(String.valueOf(i));
            }
            if (max != min) {
                if (number == max) {
                    often.add(String.valueOf(i));
                }
                if (number == min) {
                    rare.add(String.valueOf(i));
                }
            }
        }
        if (often.length() == 0) {
            often.add("0");
        }
        if (rare.length() == 0) {
            rare.add("0");
        }
        System.out.printf("Чаще: %s, отсутствует: %s, реже: %s%n", often, notUse, rare);
    }
}

