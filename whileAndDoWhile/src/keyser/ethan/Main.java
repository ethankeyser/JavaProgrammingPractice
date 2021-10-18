package keyser.ethan;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//        while(count != 5) {
//            System.out.println(count);
//            count++;
//        }
//
//        do {
//            System.out.println(count);
//            count++;
//        } while(count != 6);

        int number = 4;
        int finalNum = 20;
        int count = 0;
        while(number <= finalNum) {
            number++;
            if(!isEven(number)) {
                continue;
            } else {
                count++;
            }
            System.out.println("Even Number: " + number);
            System.out.println("Total number of even numbers: " + count);
            if(count >= 5) {
                break;
            }

        }
    }

    public static boolean isEven(int num) {
        if(num < 1) {
            return false;
        }

        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
