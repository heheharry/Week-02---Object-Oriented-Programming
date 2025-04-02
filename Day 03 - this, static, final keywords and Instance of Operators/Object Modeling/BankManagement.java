package Day3.ObjectModeling;
import java.util.ArrayList;
import java.util.List;
class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient Balance.");
            return false;
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
    }
}
class Customer {
    private String name;
    private List<BankAccount> accounts;
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }
    public void openAccount(String accountNumber, double initialBalance) {
        BankAccount account = new BankAccount(accountNumber, initialBalance);
        accounts.add(account);
    }
    public void viewBalances() {
        System.out.println("\nCustomer: " + name + "'s Accounts:");
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
        }
    }
}
class Bank {
    private String bankName;
    private List<Customer> customers;
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    public void openAccountForCustomer(Customer customer, String accountNumber, double initialBalance) {
        customer.openAccount(accountNumber, initialBalance);
    }
    public void displayCustomers() {
        System.out.println("\nBank: " + bankName + " - Customers List:");
        for (Customer customer : customers) {
            System.out.println("Customer: " + customer);
        }
    }
}
public class BankManagement {
    public static void main(String[] args) {
        Bank bank = new Bank("Global Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.openAccountForCustomer(customer1, "A101", 5000.00);
        bank.openAccountForCustomer(customer1, "A102", 3000.00);
        bank.openAccountForCustomer(customer2, "B201", 7000.00);
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
