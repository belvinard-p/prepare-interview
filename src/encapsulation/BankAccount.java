package encapsulation;

import java.util.logging.Level;

public class BankAccount {

    private static final java.util.logging.Logger LOGGER = java.util.logging.Logger.getLogger(BankAccount.class.getName());

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }



    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            LOGGER.log(Level.INFO,
                    "Account {0}: Deposited {1}. New balance: {2}",
                    new Object[]{accountNumber, amount, balance});
        } else {
            LOGGER.log(Level.WARNING,
                    "Attempted to deposit a non-positive amount: {0}",
                    amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            LOGGER.log(Level.INFO,
                    "Account {0}: Withdrew {1}. New balance: {2}",
                    new Object[]{accountNumber, amount, balance});
        } else {
            LOGGER.log(Level.WARNING,
                    "Attempted to withdraw {0}, but insufficient funds. Current balance: {1}",
                    new Object[]{amount, this.balance});
        }
    }


}
