package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    int newScore = calculateScore("Joe", 100);
        System.out.println(newScore);
        calculateScore(100);
        calculateScore();
        double cm = calcFeetAndInchesToCentimeters(100, 200);
        System.out.println(cm);
        double cm2 = calcFeetAndInchesToCentimeters(100);
        System.out.println(cm2);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    // you can use the same method name, but you must change parameters
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double cm;
        double cmft;
        double cmin;
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            cmft = feet * 30.48;
            cmin = inches * 2.54;
            cm = cmin + cmft;
            return cm;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
       if(inches < 0) {
           return -1;
       }
       double ft = inches / 12;
       double newIn = inches % 12;
       return calcFeetAndInchesToCentimeters(ft, newIn);
    }
}
