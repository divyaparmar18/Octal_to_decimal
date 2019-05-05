public class OctalToDecimalConverter {
    public static void main(String[]args){
        int octalNumber = Integer.parseInt(args[0]);
        int i=0,decimalNumber=0,lastDigit,exponent=8;
        boolean notDecimal = true;
        while(octalNumber!=0) {
            lastDigit = getLastDigit(octalNumber);
            if(lastDigit > 7) {
                notDecimal = false;
                System.out.println("your input is not an octal number");
                break;
            }
            else{
                octalNumber= getQuotient(octalNumber);
                decimalNumber+=lastDigit * ((int)(Math.pow(exponent,i)));
                i++;
            }
        }
        if (notDecimal){
            System.out.println(decimalNumber);
        }

    }

    private static int getQuotient(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }


}
