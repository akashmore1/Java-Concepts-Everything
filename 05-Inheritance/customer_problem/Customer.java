package customer_problem;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = email;
    }

    public Customer() {
        this("Nobody", 0000, "no-mail");
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

}