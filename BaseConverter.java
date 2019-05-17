import com.divya.converter.ParseResult;

import java.util.List;

import static com.divya.converter.DotProductCalculator.getProduct;
import static com.divya.converter.PowersOfNumber.getPowers;
import static com.divya.converter.SplitNumber.getDigits;
import static com.divya.converter.SumOfList.getTotal;

public class BaseConverter {
     public static void main(String[] args) {
        ParseResult parsing = new ParseResult(args);
        int base = parsing.fromBase;
        String number = parsing.number;
        int lengthOfNum = number.length();
        if (isNotValid(number, base)) {
            System.out.println("your input is not a valid number");
            return;
        }
        List<Integer> productsOfElements = getProduct(getDigits(number), getPowers(base, lengthOfNum));
         System.out.println(getTotal(productsOfElements));
    }

    private static boolean isNotValid(String number, int base) {
        for (int digit : getDigits(number)) {
            if (base <= digit) {
                return true;
            }
        }
        return false;
    }

}