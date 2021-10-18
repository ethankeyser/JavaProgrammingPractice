package keyser.ethan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getInput();
    }

    public static void getInput() {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        int max = 0;
        int min = 0;
        while(cont) {
            System.out.println("Would you like to enter a number? (y/n) ");
            String yn = scanner.nextLine();
            if(yn == "y") {
                scanner.nextLine();
                System.out.println("Enter a number: ");
                boolean isInt = scanner.hasNextInt();
                if(isInt) {
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    if(num > max) {
                        max = num;
                    } else if(num < min) {
                        min = num;
                    }
                } else {
                    System.out.println("Invalid input");
                    scanner.nextLine();
                }

            }else {
                break;
            }
        }
    }
}
