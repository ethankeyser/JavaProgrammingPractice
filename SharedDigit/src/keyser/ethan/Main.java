package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean shared = isShared(24, 32);
        System.out.println(shared);
    }

    public static boolean isShared(int num1, int num2) {
        if(num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99) {
            return false;
        }

        int current1 = 0;
        int current2 = 0;
        int current3 = 0;
        int current4 = 0;
        int count = 0;

        while(count < 2) {
            if(count == 0){
                current1 = num1 % 10;
                current2 = num2 % 10;
            } else {
                current3 = num1 % 10;
                current4 = num2 % 10;
            }

            if(current1 == current2 || current2 == current3 || current1 == current4) {
                return true;
            }
            num1 /= 10;
            num2 /= 10;
            count++;
        }
        return false;
    }
}
