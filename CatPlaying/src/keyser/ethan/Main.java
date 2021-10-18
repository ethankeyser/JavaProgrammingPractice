package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        boolean cat = isCatPlaying(false, 35);
        System.out.println(cat);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(summer) {
            if(temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if(temperature >= 25 && temperature <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }
}
