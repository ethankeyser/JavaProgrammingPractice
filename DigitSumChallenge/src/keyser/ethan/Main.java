package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int sumDigits(int num) {
        if(num < 10) {
            return -1;
        }
        int sum = 0;
        while(true) {
            sum += num % 10;
            num = num / 10;
            if(num < 10) {
                break;
            }
        }
        return sum;
    }
}
