
public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item(){}

  public Item(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  
  public double getSubtotal(){
    return this.price * this.quantity;
  }

  public String getName(){
    return this.name;
  }

  public int getQuantity(){
    return this.quantity;
  }
}
