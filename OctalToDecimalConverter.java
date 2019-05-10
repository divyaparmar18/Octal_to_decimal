import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[]args){
        String Octal = args[0];
        int lengthOfNum = Octal.length();
        if(isNotoctal(Octal)){
            System.out.println("your input is not an octal number");
            return;
        }
        int base = 8, decimal = 0;
        for( Integer digit:getDotProduct(getDigits(Octal),getPowers(base,lengthOfNum))) {
            decimal += digit;
        }
        System.out.println(decimal);
    }


    private static List<Integer> getDigits(String number) {
        int Number = Integer.parseInt(number);
        List<Integer> listOfint = new ArrayList<Integer>();
        while (Number != 0) {
            int lastDigit = getLastDigit(Number);
            Number = getQuotient(Number);
            listOfint.add(lastDigit);
        }
        return listOfint;
    }
    private static List<Integer> getPowers(int base, int times) {
        List<Integer> listOfPowers = new ArrayList<Integer>();
        for (int i = 0; i <times ; i++) {
         int Power =((int)(Math.pow(base,i)));
         listOfPowers.add(Power);
        }
        return listOfPowers;
    }

    private static List<Integer>getDotProduct(List<Integer> digitsOfNumber, List<Integer> powersOfEight){
        List<Integer> listOfDotProduct = new ArrayList<>();
        for (int i = 0; i <digitsOfNumber.size() ; i++) {
            int product = digitsOfNumber.get(i) * powersOfEight.get(i);
            listOfDotProduct.add(product);
        }
        return listOfDotProduct;
    }

    private static boolean isNotoctal(String octal) {
        return octal.contains("8") || (octal.contains("9"));
    }

    private static int getQuotient(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }
}

