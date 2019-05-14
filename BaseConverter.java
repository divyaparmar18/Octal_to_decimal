import java.util.ArrayList;
import java.util.List;

public class BaseConverter {
    public static void main(String[]args){
        String octal = args[2];
        int lengthOfNum = octal.length();
        if(isNotoctal(octal)){
            System.out.println("your input is not an octal number");
            return;
        }
        int base = Integer.parseInt(args[1]);
        int decimal = getDotProduct(getDigits(octal),getPowers(base,lengthOfNum));
        System.out.println(decimal);
    }


    private static List<Integer> getDigits(String number) {
        String [] NumOfString = number.split("");
        List<Integer> splitOfDigits = new ArrayList<>();
        for(int i = NumOfString.length;i>0;i--){
            splitOfDigits.add(Integer.valueOf(NumOfString[i-1]));
        }
        return (splitOfDigits);
    }

    private static List<Integer> getPowers(int base, int times) {
        List<Integer> listOfPowers = new ArrayList<Integer>();
        for (int i = 0; i <times ; i++) {
         int Power =((int)(Math.pow(base,i)));
         listOfPowers.add(Power);
        }
        return listOfPowers;
    }

    private static int getDotProduct(List<Integer> digitsOfNumber, List<Integer> powersOfEight){
        int product = 0;
        for (int i = 0; i <digitsOfNumber.size() ; i++) {
            product += digitsOfNumber.get(i) * powersOfEight.get(i);
        }
        return product;
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

