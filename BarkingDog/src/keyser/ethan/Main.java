package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        boolean wake = shouldWake(false, 7);
        if(wake) {
            System.out.println("Wake up");
        } else {
            System.out.println("Do not wake up");
        }
    }

    public static boolean shouldWake(boolean isBark, int hour) {
        if(isBark && hour < 8) {
            return true;
        } else if(isBark && hour >= 22 && hour <= 23) {
            return true;
        } else if(hour < 0) {
            System.out.println("Invalid hour, must be between 0 and 23");
            return false;
        } else {
            return false;
        }
    }
}
