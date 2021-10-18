package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        boolean age_3 = checkTeen3(14, 54, 23);
        boolean age = checkTeen(17);

        if(age) {
            System.out.println("They are a teen");
        } else {
            System.out.println("They are not a teen");
        }

        if(age_3) {
            System.out.println("They are a teen");
        } else {
            System.out.println("They are not a teen");
        }

    }

    public static boolean checkTeen3(int age1, int age2, int age3) {
        if(age1 >= 13 && age1 <= 19) {
            return true;
        } else if(age2 >= 13 && age2 <= 19) {
            return true;
        } else if(age3 >= 13 && age3 <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTeen(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
