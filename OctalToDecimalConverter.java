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
                octalNumber= getOctalNumber(octalNumber);
                decimalNumber+=lastDigit * ((int)(Math.pow(exponent,i)));
                i++;
            }
        }
        if (notDecimal==true){
            System.out.println("The decimal number of the number you have given is "+decimalNumber);
        }

    }

    private static int getOctalNumber(int octalNumber) {
        return octalNumber / 10;
    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }


}
