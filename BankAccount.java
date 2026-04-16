package lop;
class BankAccount {

    private String name;
    private int accountNumber;
    private double balance;

    // constructor
    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
