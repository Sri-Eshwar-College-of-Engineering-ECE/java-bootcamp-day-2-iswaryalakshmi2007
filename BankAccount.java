public class BankAccount {
    // Instance variable
    double balance;

    void deposit() {
        // Local variable
        double depositAmount = 2000;

        System.out.println("Current Balance: " + balance);

        balance = balance + depositAmount;

        System.out.println("Deposit Amount: " + depositAmount);
        System.out.println("Updated Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.balance = 10000;

        account.deposit();
    }
}