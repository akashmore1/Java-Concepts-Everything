package customer_problem;

public class Main {
    public static void main(String[] args) {
        // Creating new object
        // Java objects are reference type
        // When we change value of a static variable, its value changes for every
        // object.
        Customer customer = new Customer("Akash", 9999, "akash@gmail.com");

        customer.getName();
        customer.getCreditLimit();
        customer.getEmailAddress();
    }
}