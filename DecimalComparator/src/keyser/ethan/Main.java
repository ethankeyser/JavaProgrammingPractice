package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        boolean isEq = isEqualByThreeDecimals(3.44, 3.444);
        if(isEq) {
            System.out.println("The two numbers are equal by 3 decimal places");
        } else {
            System.out.println("The two numbers are not equal by 3 decimal places");
        }
    }

    public static boolean isEqualByThreeDecimals(double num1, double num2) {
        String number = Double.toString(num1);
        String number2 = Double.toString(num2);
        String newNumber;
        String newNumber2;
        int decimal = number.indexOf('.');
        int decimalPlaces = number.length() - 1 - decimal;
        int decimal2 = number2.indexOf('.');
        int decimalPlaces2 = number2.length() - 1 - decimal2;
        if(decimalPlaces > 3) {
            newNumber = number.substring(0, decimal + 4);
            System.out.println(newNumber);
        } else {
            newNumber = number;
        }
        if(decimalPlaces2 > 3) {
            newNumber2 = number2.substring(0, decimal2 + 4);
        } else {
            newNumber2 = number2;
        }
        System.out.println(newNumber2);
        System.out.println(newNumber);

        if(newNumber.equals(newNumber2)) {
            return true;
        } else {
            return false;
        }


    }
}
