package keyser.ethan;

import java.util.DoubleSummaryStatistics;

public class bankAccounts {
    private int accountNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    public bankAccounts() {
        this(0000, 0, "Default First Name", "Default Last Name", "Default Email", 0000000000);
        System.out.println("Empty constructor called");
    }

    public bankAccounts(int accountNumber, double balance, String firstName, String lastName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this. firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Success. Remaining amount: " + balance);
        } else {
            System.out.println("Please enter a valid amount.");
        }

    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            this.balance -= amount;
            System.out.println("Success. Remaining amount: " + balance);
        }
        else {
            System.out.println("Insufficient balance: " + balance);
        }
    }
}
