package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    int value = 1;

        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("was 3, 4, or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char c = 'a';

        switch (c) {
            case 'a':
                System.out.println("Letter was a");
                break;
            case 'b':
                System.out.println("Letter was b");
                break;
            case 'c':
                System.out.println("Letter was c");
                break;
            case 'd':
                System.out.println("Letter was d");
                break;
            case 'e':
                System.out.println("Letter was e");
                break;
            default:
                System.out.println("Letter not found");
                break;
        }
    }
}
