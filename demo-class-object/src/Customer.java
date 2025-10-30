public class Customer {
  // Customer has many orders, a order has many items
  // Item: quantity, price, name...
  // Classes: Customer, Order, Item
  private Order[] orders;


public Customer(){}

public Customer(Order[] orders){
  this.orders = orders;
}

public Order[] getOrders(){
  return this.orders;
}

public void setOrders(Order[] orders){
  this.orders = orders;
}
  public static void main(String[] args) {
    //Place item into shopping cart
    //checkout -> new order (total amouont)
    //history

  }
  
}
