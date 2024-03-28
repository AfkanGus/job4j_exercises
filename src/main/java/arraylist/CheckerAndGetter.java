package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CheckerAndGetter {
    public static String getElement(List<String> list) {
        return !list.isEmpty() ? list.get(0) : "";
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = CheckerAndGetter.getElement(list);
        System.out.println(result);
    }
}
