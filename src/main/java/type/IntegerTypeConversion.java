package type;

/**
 *3. Приведение типов. Целые числа
 */
public class IntegerTypeConversion {
    public static void main(String[] args) {
        int num = 1;
        long numUpper = num;
        short numLower = (short) num;
        System.out.println(numLower);
        System.out.println(numUpper);
    }
}
