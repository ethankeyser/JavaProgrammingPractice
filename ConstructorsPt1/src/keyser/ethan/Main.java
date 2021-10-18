package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	    bankAccounts myAccount = new bankAccounts();
        bankAccounts newAccount = new bankAccounts(5543, 1000, "Joe", "Smith", "test", 12414124);
        myAccount.setAccountNumber(8321);
        myAccount.setBalance(1000);
        myAccount.setEmail("e@gmail.com");
        myAccount.setFirstName("Ethan");
        myAccount.setLastName("Keyser");
        myAccount.setPhoneNumber(1234567890);
        myAccount.deposit(1000000);


    }
}
