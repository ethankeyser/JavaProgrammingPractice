package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        PrintDaysAndYears(561600);
    }

    public static void PrintDaysAndYears(long minutes) {
        int minYears = 525600;
        if(minutes < 0) {
            System.out.println("Invalid number entered");
        } else {
            long years;
            long days;
            years = minutes / minYears;
            if(years >= 1) {
                days = (minutes % minYears) / 1440;
                System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
            } else if(minutes >= 1440){
                days = minutes / 1440;
                years = 0;
                System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
            } else {
                days = 0;
                years = 0;
                System.out.println(minutes + " minutes = " + years + " years and " + days + " days");
            }
        }
    }
}
