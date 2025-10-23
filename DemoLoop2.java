import java.math.BigDecimal;

public class DemoLoop2 {
  
  public static void main(String[] args){


    //!Basic (almighty loop)
    for(int i = 0; i < 5; i++){
      System.out.println(i);
    }

    //!While loop
    int counter = 0; //! dont use i ,overlap with basic loop
    while (counter < 5) {
      System.out.println(counter);
      counter++;
    } //while more flexible, but rarer to use

    // Array
    double[] amounts = new double[4]; //!use plural to declar array to notice oneself
    amounts[0] = 10.5;
    amounts[1] = 100.9;
    amounts[2] = 24.222;
    amounts[3] = 1010.9;

    //!for-each loop (simplest form of loop)
    for(double amount : amounts) {
      System.out.println(amount); //amount is copy of value in amounts  
    }//!only for read value, cannot edit(write) the value (aka amount = 100)
    //compare to baisc
    for(int i = 0; i < amounts.length; i++){
      System.out.println(amounts[i]); 
    }//!can read and over-write (aka amounts[i]=100)

    //!Sum up values (important)
    double total = 0.0;
    BigDecimal total2 = BigDecimal.valueOf(total);
    for(double amount : amounts){
      BigDecimal amount2 = BigDecimal.valueOf(amount);
      total2 = total2.add(amount2);
    }System.out.println(total2.doubleValue());

    //solution
    total = 0.0;
    for(double amount : amounts){
      total = BigDecimal.valueOf(total).add(BigDecimal.valueOf(amount)).doubleValue();
    }
    System.out.println("total="+ total);


    // Do-while (minor)





  }

  
}
