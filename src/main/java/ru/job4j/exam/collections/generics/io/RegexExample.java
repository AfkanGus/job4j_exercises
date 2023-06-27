package ru.job4j.exam.collections.generics.io;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Регулярные выражения (Regular Expressions или RegEx) - это шаблоны,
 * с помощью которых производится поиск по совпадению в тексте
 * Метод compile() класса Pattern создает неизменяемый шаблон
 * из переданной последовательности символов,
 * Метод matcher() класса Pattern создает
 * сопоставитель нашего шаблона с заданным текстом.
 * Регулярные выражения регистрозависимые.
 * Pattern.CASE_INSENSITIVE - при поиске совпадений
 * регистр букв учитываться не будет:
 *
 * <p>
 * Метод find() ищет ближайшее совпадение
 * Его можно применять многократно. Каждый вызов метода find()
 * начинается с места, где закончился его предыдущий вызов.
 * Чтобы найти многократные вхождения шаблона в коде,
 * нужно использовать find() в цикле:
 * Также можно проверить шаблон на его присутствие в тексте.
 * group() - Получить найденное совпадение в виде строки.
 * Этот метод выводит ту часть текста, которая совпадает
 * с шаблоном регулярного выражения.
 * </p>
 * Метод start() - получает индекс, в котором находится первый символ искомой
 * последовательности символов.
 * <p>
 * Метод end() - получает индекс, следующий за последним символом искомой
 * последовательности символов.
 * <p>
 * replaceAll() - найденные совпадения можно заменить другой строкой.
 * String rsl = matcher.replaceAll("Job4j");
 * </p>
 */
public class RegexExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java.");
        String text = "i learn Java every day, Java is power";
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("fined string " + matcher.group()
                    + ("Найдено совпадение. iStart: " + matcher.start()
                    + " iEnd: " + matcher.end()));
        }
    }
}
