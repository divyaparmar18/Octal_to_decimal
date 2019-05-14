import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
    public static void main(String[] args) {
        int base = Integer.parseInt(args[1]);
        String number = args[2];
        int lengthOfNum = number.length();
        if (isNotValid(number, base)) {
            System.out.println("your input is not a valid number");
            return;
        }
        int decimal = DotProductCalculator.getDotProduct(SplitNumber.getDigits(number), PowersOfNumber.getPowers(base, lengthOfNum));
        System.out.println(decimal);
    }


    private static boolean isNotValid(String number, int base) {
        for (int digit : SplitNumber.getDigits(number)) {
            if (base <= digit) {
                return true;
            }
        }
        return false;
    }

}
