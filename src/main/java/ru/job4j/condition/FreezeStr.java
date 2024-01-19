package ru.job4j.condition;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * 2. Проверить две строчки на идентичность.
 * Даны две строки. Нужно проверить, что вторая строка получилась
 * методом перестановок символов в первой строке.
 */
public class FreezeStr {
    public static boolean eq(String left, String right) {
        // Проверка на null и равную длину строк
        if (left == null || right == null || left.length() != right.length()) {
            return false;
        }

        // Подсчет символов в первой строке
        Map<Character, Integer> charCount = new HashMap<>();
        // Увеличиваем количество символов в Map для первой строки
        for (char c : left.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Уменьшаем количество символов в Map для второй строки
        for (char c : right.toCharArray()) {
            // Если символ отсутствует в Map или его количество стало равным 0, возвращаем false
            if (!charCount.containsKey(c) || charCount.get(c) == 0) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
        }
            return true;
        }
    }

