package Day3.StaticFinalKeywordsAndInstanceOfOperator;
class BankAccount {
    static String bankName = "Global Bank";
    static int totalAccounts = 0;
    final String accountNumber;
    String accountHolderName;
    double balance;
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("\nAccount Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
        }
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount acc1 = new BankAccount("Alice", "123456789", 5000);
        BankAccount acc2 = new BankAccount("Bob", "987654321", 8000);

        // Display individual account details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        // Display total number of accounts
        BankAccount.getTotalAccounts();
    }
}
