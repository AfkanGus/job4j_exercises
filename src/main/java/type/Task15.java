package type;

public class Task15 {
    public static String increaseBy2(int number) {
        int a, b, c;
        a = number + 2;
        b = number + 4;
        c = number + 6;
        return a + ", " + b + ", " + c;
    }

    public static void main(String[] args) {
        Task15 task15 = new Task15();
        System.out.println(increaseBy2(6));
    }
}