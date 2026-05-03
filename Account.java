package Encap;
abstract class Account {
    private String name;
    private int accNo;
    protected double balance;

    public Account(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getName() { return name; }
    public int getAccNo() { return accNo; }
    public double getBalance() { return balance; }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Acc No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}