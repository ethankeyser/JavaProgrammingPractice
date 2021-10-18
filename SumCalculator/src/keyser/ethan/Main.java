package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(40);
        calc.setSecondNumber(50);

        System.out.println(calc.getAdditionResult());
        System.out.println(calc.getSubtractionResult());
        System.out.println(calc.getMultiplicationResult());
        System.out.println(calc.getDivisionResult());

    }
}
