package lop;
public class Main {
    public static void main(String[] args) {

        BankAccount user = new BankAccount("Omkar", 12345, 5000);

        user.display();

        user.deposit(2000);
        user.withdraw(3000);

        user.display();
    }
}