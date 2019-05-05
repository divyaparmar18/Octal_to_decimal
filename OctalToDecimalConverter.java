import java.util.ArrayList;
import java.util.List;

public class OctalToDecimalConverter {
    public static void main(String[]args){
        String Octal = args[0];
        if(isNotoctal(Octal)){
            System.out.println("your input is not an octal number");
            return;
        }
        int octalNumber = Integer.parseInt(args[0]);
        int i=0,decimalNumber=0,lastDigit,exponent=8;
        while(octalNumber!=0) {
            lastDigit = getLastDigit(octalNumber);
            octalNumber= getQuotient(octalNumber);
            decimalNumber+=lastDigit * ((int)(Math.pow(exponent,i)));
            i++;
        }
        System.out.println(decimalNumber);
    }

    private static List getDigits(int Number) {
        List<Integer> listOfint = new ArrayList<Integer>();
        while (Number != 0) {
            int lastDigit = getLastDigit(Number);
            Number = getQuotient(Number);
            listOfint.add(lastDigit);
        }
        return listOfint;
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

