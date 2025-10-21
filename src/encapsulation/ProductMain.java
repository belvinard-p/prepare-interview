package encapsulation;

import java.util.logging.Logger;

public class ProductMain {
    private static final Logger LOGGER = Logger.getLogger(ProductMain.class.getName());
    public static void main(String[] args) {
        Product product = new Product("Laptop", 999.99, 10);
        
        LOGGER.info("Initial: " + product.getProductName() + ", Price: $" + product.getPrice() + ", Stock: " + product.getQuantity());
        LOGGER.info("Inventory Value: $" + product.getInventoryValue());
        
        product.addStock(5);
        LOGGER.info("After adding 5: Stock = " + product.getQuantity());
        
        product.sell(3);
        LOGGER.info("After selling 3: Stock = " + product.getQuantity());
        
        product.sell(20); // Should fail - insufficient stock
        LOGGER.info("After trying to sell 20: Stock = " + product.getQuantity());
    }
}
