package main.java.converter;

import java.util.ArrayList;
import java.util.List;

public class DotProductCalculator {
    public static List<Integer> getProduct(List<Integer> digitsOfNumber, List<Integer> powersOfEight) {
        List<Integer> seriesOfProduct = new ArrayList<>();
        int product = 0;
        for (int i = 0; i < digitsOfNumber.size(); i++) {
            product= digitsOfNumber.get(i) * powersOfEight.get(i);
            seriesOfProduct.add(product);
        }
        return seriesOfProduct;
    }
}
