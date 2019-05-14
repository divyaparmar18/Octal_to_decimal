import com.divya.converter.DotProductCalculator;

import static com.divya.converter.DotProductCalculator.getDotProduct;
import static com.divya.converter.PowersOfNumber.getPowers;
import static com.divya.converter.SplitNumber.getDigits;
import static java.lang.Integer.parseInt;

public class BaseConverter {
    public static void main(String[] args) {
        int base = parseInt(args[1]);
        String number = args[2];
        int lengthOfNum = number.length();
        if (isNotValid(number, base)) {
            System.out.println("your input is not a valid number");
            return;
        }
        int decimal = getDotProduct(getDigits(number), getPowers(base, lengthOfNum));
        System.out.println(decimal);
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