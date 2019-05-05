public class OctalToDecimalConverter {
    public static void main(String[]args) {
        String octalNumber = args[0];
        boolean notDecimal = true;
        int i=0,decimalNumber=0,exponent=8,lastDigit;
        String[] number = octalNumber.split("");
        for(int len = number.length;len>0;len--){
            lastDigit = Integer.parseInt(number[len-1]);
            if (lastDigit > 7){
                notDecimal = false;
                System.out.println("Not valid, the number is not an octal number");
            }
        }
//        boolean notDecimal = true;
//        if (notDecimal){
//            System.out.println(decimalNumber);
//        }
//
//    }
//
//    private static int getQuotient(int octalNumber) {
//        return octalNumber / 10;
//    }
//
//    private static int getLastDigit(int octalNumber) {
//        return octalNumber % 10;
  }
//
//
}
