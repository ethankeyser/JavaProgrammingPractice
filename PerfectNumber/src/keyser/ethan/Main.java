package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean isPer = isPerfect(5);
        System.out.println(isPer);
    }

    public static boolean isPerfect(int num) {
        if(num < 1) {
            return false;
        }

        int i = 1;
        int sum = 0;
        while(i <= num / 2) {
            if(num % i == 0) {
                sum += i;
            }
            i++;
        }
        if(sum == num) {
            return true;
        } else {
            return false;
        }
    }
}
