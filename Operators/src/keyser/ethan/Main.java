package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        boolean bool = false;

        if (!bool) {
            System.out.println("Not true");
        }

        int topScore = 90;
        if(topScore <= 100) {
            System.out.println("you got the high score");
        }

        int secondNum = 91;

        if(topScore > secondNum || topScore < 100) {
            System.out.println("Greater than second score and less than 100");
        }
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        //isCar is the condition (think of it as isCar == true), first value is what to set the value if isCar is true and the second is the else
        
    }
}
