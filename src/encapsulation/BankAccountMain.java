package encapsulation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccountMain {

    private static final Logger LOGGER = Logger.getLogger(BankAccountMain.class.getName());

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", 10000.0);
        myAccount.deposit(5000.0);
        myAccount.withdraw(2000.0);

        LOGGER.log(Level.INFO, "Current balance: {0}", myAccount.getBalance());
    }
}
