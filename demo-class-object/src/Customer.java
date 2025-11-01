
import java.awt.SystemColor;
import java.math.BigDecimal;

public class Customer {
  // Customer has many orders, a order has many items
  // Item: quantity, price, name...
  // Classes: Customer, Order, Item
  private Order[] orders;


public Customer(){
  this.orders = new Order[0];
}



// isVip() ->if totalAmount of all orders >=10000
// public double allOrderAmount(){
//   BigDecimal total = BigDecimal.ZERO;
//   for(Order order : this.orders){
//  total = total.add(BigDecimal.valueOf(order.totalAmount()));
//   }return total.doubleValue();
// }
// public boolean isVip(){
//   if(this.allOrderAmount() >= 10000.0){
//     return true;
//   }return false;
// }

//solution
public boolean isVip(){
  BigDecimal total = BigDecimal.ZERO;
  for(Order order : this.orders){
    total = total.add(BigDecimal.valueOf(order.totalAmount()));
  }return total.doubleValue()>= 10000.0;
}


public void addOrder(Order newOrder){  
    Order[] newOrders = new Order[this.orders.length+1];
    int idx = 0;
    for(Order order : this.orders){
      newOrders[idx] = order;
      idx++;              //alt. newOrders[idx++] = order;
    }
    newOrders[idx] = newOrder;
    this.orders = newOrders;
    }

    

  public static void main(String[] args) {
    //Place item into shopping cart
    //checkout -> new order (total amouont)
    //history

    // Item abc = new Item("ABC", 2.5, 3);
    // Item def = new Item("DEF", 9.9, 10);
    // Item ijk = new Item("IJK", 999.9, 2);
    // Order o1 = new Order();
    // o1.addItem(abc);
    // o1.addItem(def);
    // o1.addItem(ijk);
    Order o1 = new Order();
    o1.addItem(new Item("ABC", 2.5, 3));
    o1.addItem(new Item("DEF", 9.9, 10));
    o1.addItem(new Item("IJK", 999.9, 2));
    System.out.println(o1.totalAmount());

    //Given Item name, find the subtotal
    System.out.println(o1.getSubtotal("DEF"));
    

    Customer c1 = new Customer();
    o1.addItem(new Item("XYZ", 9000, 1));
    c1.addOrder(o1);
    System.out.println(c1.isVip());//true

}
  }
  

