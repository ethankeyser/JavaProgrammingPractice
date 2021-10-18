package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        getDurationString(700, 50);
    }

    public static void getDurationString(long minutes, long seconds) {
        int hours;
        long newMin;
        if(minutes < 0 || seconds >59 || seconds < 0) {
            System.out.println("Invalid minutes and/or seconds");
        } else {
            if(minutes >= 60) {
                hours = (int) minutes / 60;
                newMin = minutes % 60;
                System.out.println(hours + " hours; " + newMin + " minutes; " + seconds + " seconds");
            } else {
                System.out.println("0 hours; " + minutes + " minutes; " + seconds + " seconds");
            }
        }
    }
}
