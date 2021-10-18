package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printStars(5);
    }

    public static void printStars(int num) {
        if(num < 5) {
            System.out.println("Invalid Number");
        } else {
            int i = 1;
            while(i <= num) {
                if(i == 1 || i == num) {
                    for(int j = 0; j < num; j++) {
                        System.out.print("*");
                    }
                } else {
                    for(int col = 1; col <= num; col++) {
                        if(col == 1 || col == num) {
                            System.out.print("*");
                        }else if(i == col){
                            System.out.print("*");
                        }else if(col == num - i + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
                i++;
            }
        }
    }
}
