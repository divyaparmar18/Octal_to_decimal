public class OctalToDecimalConverter {
    public static void main(String[]args) {
        String octalNumber = args[0];
        boolean notOctal = true;
        int i = 0, decimalNumber = 0, exponent = 8, lastDigit;
        String[] number = octalNumber.split("");
        for (int len = number.length; len > 0; len--) {
            lastDigit = Integer.parseInt(number[len - 1]);
            if (lastDigit > 7) {
                notOctal = false;
                System.out.println("Not valid, the number is not an octal number");
            } else decimalNumber += lastDigit * ((int) Math.pow(exponent, i));
        }
    }
}
