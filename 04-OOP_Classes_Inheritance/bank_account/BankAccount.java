package bank_account;

public class BankAccount {
    private long accountNumber;
    private double balance = 0;
    private String customerName;
    private String email;
    private long phoneNumber;

    public void setAccountNumber(long accNum) {
        this.accountNumber = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds) {
        this.balance += funds;
        System.out.println(this.balance);
    }

    public void withdrawFunds(double funds) {

        if (funds > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= funds;
            System.out.println(this.balance);
        }
    }

    // public void printAccountDetail(){
    // System.out.println("Name: " + this.customerName);
    // System.out.println();
    // }
}
