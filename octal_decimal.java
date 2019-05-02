import java.util.Scanner;
public class octal_decimal {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a nmber to be converted");
        int octalNumber = obj.nextInt();
        System.out.println(octalNumber);
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
                octalNumber=octalNumber/10;
                System.out.println(octalNumber);

            }
        }

    }

    private static int getLastDigit(int octalNumber) {
        return octalNumber % 10;
    }


}
