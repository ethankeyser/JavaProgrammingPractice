package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        printFactors(10);
    }


    public static void printFactors(int num) {
        if(num < 1) {
            System.out.println("Invalid Number");
        }
        int i = 1;
        while(i <= num) {
            if(num % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
