package Day2.AccessModifiers;
class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void displayDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("\nInterest Earned: $" + interest);
    }
    public void displaySavingsDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
public class DisplaySavingDetails {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount acc1 = new BankAccount("123456789", "Alice", 5000);
        acc1.displayDetails();
        acc1.deposit(1000);
        acc1.withdraw(2000);
        System.out.println("Updated Balance: $" + acc1.getBalance());
        SavingsAccount savingsAcc = new SavingsAccount("987654321", "Bob", 8000, 5);
        savingsAcc.displaySavingsDetails();
        savingsAcc.calculateInterest();
    }
}
