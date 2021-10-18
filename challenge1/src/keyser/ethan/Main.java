package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    double num1 = 20.00d;
        double num2 = 80.00d;

        double prod;

        double rem;

        boolean isRemainder;

        prod = (num1 + num2) * 100.00d;

        rem = prod % 40.00d;

        boolean isRem = (rem == 0) ? true : false;
        if(!isRem) {
            System.out.println(isRem);
            System.out.println("Remainder: " + rem);
        }
        System.out.println(isRem);

    }
}
