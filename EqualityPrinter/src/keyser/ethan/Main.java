package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        printEqual(4, 3, 5);
    }

    public static void printEqual(int x, int y, int z) {
        if(x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid number entered");
        } else {
            if(x == y && y == z) {
                System.out.println("All numbers are equal");
            } else if(x != y && y != z) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("All numbers are neither all the same or different.");
            }
        }
    }
}
