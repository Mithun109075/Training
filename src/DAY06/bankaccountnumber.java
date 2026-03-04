package Assignment;

class BankAccount {

    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accNo, double initialBalance) {
        accountNumber = accNo;
        balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Method to display account details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class bankaccountnumber {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("12345", 1000);

        acc1.display();
        acc1.deposit(500);
        acc1.withdraw(300);
        acc1.withdraw(1500);
    }
}
