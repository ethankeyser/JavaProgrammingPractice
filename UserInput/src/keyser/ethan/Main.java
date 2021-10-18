package keyser.ethan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //makes sure that the next field is not skipped
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;
            if(age >= 0 && age <= 110) {
                System.out.println("Your name is " + name + ", and you are " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid input");
        }


        scanner.close();
    }
}
