package bank_account;

public class Main {
    public static void main(String[] args) {
        BankAccount akash = new BankAccount();

        akash.setAccountNumber(4444l);
        akash.setBalance(400.00d);
        akash.setCustomerName("Akash More");
        akash.setEmail("akashkmore1@gmail.com");
        akash.setPhoneNumber(8482831779l);

        akash.depositFunds(44);
        akash.withdrawFunds(44);
        akash.withdrawFunds(444);
    }
}
