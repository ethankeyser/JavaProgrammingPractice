package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean hasDig = hasLastDigit(33, 44, 53);
        System.out.println(hasDig);
    }

    public static boolean hasLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1, num2, num3)) {
            return false;
        }
        int current1;
        int current2;
        int current3;

            current1 = num1 % 10;
            current2 = num2 % 10;
            current3 = num3 % 10;

            if(current1 == current2 || current1 == current3 || current2 == current3) {
                return true;
            } else {
                return false;
            }

    }

    public static boolean isValid(int num1, int num2, int num3) {
        if(num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000) {
            return false;
        } else {
            return true;
        }
    }
}
