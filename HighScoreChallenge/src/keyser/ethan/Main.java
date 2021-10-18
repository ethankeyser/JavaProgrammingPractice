package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    int pos = CalcHighScorePosition(1500);
        displayHighScorePosition("Joe", pos);
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " is placed at number " + position + " on the high score table.");
    }

    public static int CalcHighScorePosition(int score) {
        int position;
        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position = 3;
        } else {
            position = 4;
        }
        return position;
    }
}
