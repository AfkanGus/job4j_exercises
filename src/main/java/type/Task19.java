package type;

public class Task19 {
    public static void sumAndConvert(double money,
                                     double gift, double ratio) {
        double euro = (money + gift) * ratio;
        String formattedEuro = String.format("%.2f", euro).replace(",", ".");
        System.out.print(formattedEuro);
    }
}
