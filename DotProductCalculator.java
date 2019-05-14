import java.util.List;

public class DotProductCalculator {
    public static int getDotProduct(List<Integer> digitsOfNumber, List<Integer> powersOfEight) {
        int product = 0;
        for (int i = 0; i < digitsOfNumber.size(); i++) {
            product += digitsOfNumber.get(i) * powersOfEight.get(i);
        }
        return product;
    }
}
