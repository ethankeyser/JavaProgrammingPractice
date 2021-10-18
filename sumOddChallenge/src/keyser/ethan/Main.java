package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        int sum = sumOdd(100, 100);
        System.out.println(sum);
    }

    public static boolean isOdd(int num) {
        if(num < 1) {
            return false;
        }

        if(num % 2 != 0) {
            return true;
        } else {
            return  false;
        }
    }

    public static int sumOdd(int start, int finish) {
        int sum = 0;
        if(start < 0 || finish < 0) {
            return -1;
        } else if(start > finish) {
            return -1;
        }

        for(int i = start; i <= finish; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
