package keyser.ethan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        readInput();
    }

    public static void readInput() {
        int sum = 0;
        int current = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            int currentNum = i + 1;
            System.out.println("Enter number " + currentNum + ": ");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                current = scanner.nextInt();
                scanner.nextLine();
                sum += current;
            } else {
                System.out.println("Invalid number");
                i--;
                scanner.nextLine();
            }
        }
        System.out.println("Sum = " + sum);
    }
}
