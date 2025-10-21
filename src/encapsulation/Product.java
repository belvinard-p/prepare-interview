package encapsulation;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getProductName() {
    return name;
  }

  public void setProductName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price > 0) {
      this.price = price;
    }
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    if (quantity >= 0) {
      this.quantity = quantity;
    }
  }

  public void addStock(int qty) {
    if (qty > 0) {
      this.quantity += qty;
    }
  }

  public void sell(int qty) {
    if (qty > 0 && qty <= this.quantity) {
      this.quantity -= qty;
    }
  }

  public double getInventoryValue() {
    return price * quantity;
  }
}
