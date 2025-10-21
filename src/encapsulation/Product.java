package encapsulation;

public class Product {
  private String name;
  private double price;
  private int quantity;

  public void setProductName(String name){
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
