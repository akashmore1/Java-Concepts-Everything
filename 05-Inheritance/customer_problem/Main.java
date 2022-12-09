package customer_problem;

public class Main {
    public static void main(String[] args) {
        // Creating new object
        // Java objects are reference type
        Customer customer = new Customer("Akash", 9999, "akash@gmail.com");

        customer.getName();
        customer.getCreditLimit();
        customer.getEmailAddress();
    }
}