public class OctalToDecimalConverter {
    public static void main(String[]args){
        String Octal = args[0];
        if(Octal.contains("8")||(Octal.contains("9"))){
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

    private static int getQuotient(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }
}
