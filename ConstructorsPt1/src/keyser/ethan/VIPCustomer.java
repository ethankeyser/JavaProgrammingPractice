package keyser.ethan;

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer() {
        this("Default Name", 10000, "Default Email");
    }

    public VIPCustomer(String name, String email) {
        this(name, 10000, email);
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
