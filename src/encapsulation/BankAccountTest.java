package encapsulation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BankAccountTest {

    private static final Logger LOGGER = Logger.getLogger(BankAccountTest.class.getName());

    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123", 1000.0);

        LOGGER.log(Level.INFO, "Account: {0}", account.getAccountNumber());
        account.setAccountNumber("ACC456");
        LOGGER.log(Level.INFO, "Updated Account: {0}", account.getAccountNumber());
    }
}
