package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        person ethan = new person();

        ethan.setFirstName("Ethan");
        ethan.setLastName("Keyser");
        ethan.setAge(17);

        System.out.println(ethan.isTeen());
        System.out.println(ethan.getFullName());
    }
}
