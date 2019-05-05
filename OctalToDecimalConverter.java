public class OctalToDecimalConverter {
    public static void main(String[]args){
        String Octal = args[0];
        boolean isNotoctal = isNotoctal(Octal);
        if(isNotoctal){
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

    private static boolean isNotoctal(String octal) {
        return IfNotoctal(octal);
    }

    private static boolean IfNotoctal(String octal) {
        return isIfNotoctal(octal);
    }

    private static boolean isIfNotoctal(String octal) {
        return octal.contains("8") || (octal.contains("9"));
    }

    private static int getQuotient(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }
}
