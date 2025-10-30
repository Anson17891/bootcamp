
import java.math.BigDecimal;

public class Order {
  private Item[] items;
  
  public Order(){ //How many item???
    this.items = new Item[0]; //preset shopping cart is empty
  }

  public int itemAmount(){
    return this.items.length;
  }


  public void addItem(Item newItem){  //! IMPORTANT
    //!copy the original items into new array
    Item[] newItems = new Item[this.items.length + 1];
    int idx = 0;
    for(Item item : this.items){ 
      newItems[idx] = item;
      idx++;
    }
    newItems[idx] = newItem;
    this.items = newItems;  //! redirect this.items to newItems
  }

  public double totalAmount(){
    BigDecimal totalAmount = BigDecimal.ZERO;
    Item[] items = this.items;
    for(Item item : items){
      totalAmount = totalAmount.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return totalAmount.doubleValue();
  }
  

  public static void main(String[] args) {
    Order o1 = new Order();
    Item i1 = new Item();
    o1.addItem(i1);
    
  }

}
