package ru.job4j.searchkriteria;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class Search {
    static Predicate<Path> searchCondition(Map<String, String> values) {
        Predicate<Path> result;
        String t = values.get("t");
        String  n = values.get("n");
        if (t.equals("mask")) {
            // Экранируем символы в регулярном выражении
            String regex = Pattern.quote(n.replace("?", "."));
            // Используем экранированную версию регулярного выражения
            result = path -> path.toFile().getName().matches(regex);
        } else {
            // Добавляем обработку других типов поиска
            throw new IllegalArgumentException("Unsupported search type: " + t);
        }

        return result;
    }
}
