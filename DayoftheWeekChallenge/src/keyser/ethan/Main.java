package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    dayoftheWeek(4);
    }

    public static void dayoftheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("The day is Sunday");
                break;
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }
    }

}
