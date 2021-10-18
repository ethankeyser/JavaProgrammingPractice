package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        CalcScore(800, 8, 200, true);
        int highScore = CalcScore(1000, 10, 400, true);
        System.out.println(highScore);
    }

    public static int CalcScore(int score, int lvl, int bonus, boolean isGameOver) {

        if(isGameOver) {
            int finalScore = score + (lvl * bonus);
            System.out.println(finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }
}
