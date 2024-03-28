package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * еобходимо реализовать метод, который добавляет элемент в список и
 * сообщает нам удалось это или нет,
 */
public class AddElement {
    public static boolean addNewElement(List<String> list, String string) {
        List<String> newList = new ArrayList<>();
        newList.add(string);
        return !newList.isEmpty();
    }
}
