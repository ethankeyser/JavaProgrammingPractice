package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numToWord(2364);
    }

    public static void numToWord(int num) {
        if(num < 0) {
            System.out.println("Invalid number");
        }
        int current;
        double startNum = num;
        String convertedNum = "";
        while(startNum / 10 > 1) {
            startNum /= 10;
        }
        int count = 0;
        while(true) {
            if(count == 0){
                current = (int) startNum;
            } else {
                current = (int) startNum % 10;
            }

            if(current == 0) {
                convertedNum += "Zero ";
            } else if(current == 1) {
                convertedNum += "One ";
            }else if(current == 2) {
                convertedNum += "Two ";
            }else if(current == 3) {
                convertedNum += "Three ";
            }else if(current == 4) {
                convertedNum += "Four ";
            }else if(current == 5) {
                convertedNum += "Five ";
            }else if(current == 6) {
                convertedNum += "Six ";
            }else if(current == 7) {
                convertedNum += "Seven ";
            }else if(current == 8) {
                convertedNum += "Eight ";
            }else if(current == 9) {
                convertedNum += "Nine ";
            }
            if(startNum * 10 > num) {
                break;
            }
            startNum *= 10;
            count++;
        }
        System.out.println(convertedNum);
    }
}
