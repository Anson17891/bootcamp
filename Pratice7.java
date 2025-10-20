import java.math.BigDecimal;
import java.math.RoundingMode;

public class Pratice7 {
  public static void main(String[] args) {


    //for loop
     for (int i = 0; i < 10; i++){
     System.out.println(i);
     } // print from 0 to 9
     


    for (double i = 0; i < 10; i++){
    double part1 = BigDecimal.valueOf((1+Math.sqrt(5))/2.0).doubleValue();
    double part2 = BigDecimal.valueOf((1-Math.sqrt(5))/2.0).doubleValue();
    double part3 = BigDecimal.valueOf(1/Math.sqrt(5)).doubleValue();
    double part1a = BigDecimal.valueOf(Math.pow(part1,i)).doubleValue();
    double part2a = BigDecimal.valueOf(Math.pow(part2,i)).doubleValue();
    double fibonacci = BigDecimal.valueOf(part3*(part1a - part2a))//
    .setScale(2, RoundingMode.HALF_UP)//
    .doubleValue();
    System.out.println(fibonacci);
     } //Fibonacci sequence  WTF

     for (char i = 35; i <= 60; i+=1){
         System.out.println(i);
     } // i can be byte~long, for alphabet/sign->use char
     
     for (int i = 0; i<10; i++){
        double geoProg = 2 * Math.pow(2,i);
        System.out.println(geoProg);
     }//Geometric progression a,n=ar^(n-1)
     
     //!still, beware of bigdecimal/overflow/int<->double

     for (double i = 0; i>-0.1; i-=0.01){
         System.out.println(i);
     }
     //!-0.060000000000000005, -0.09999999999999999
     //solution
     for(int i = 0; i < 10; i++){
      double minus = -0.01*i;
      System.out.println("minus= " + minus);
     }

     int p = 10;
     for(int i = 0; i < 10; i++){
         double y = i+1;
      double z = p/y; // int / double ->double
        System.out.println(Math.round(z*100)/100.0); //! dont forget .0
     }

 //nested loop, inner loop and outer loop
         for(int i = 1; i<=5; i++){
         System.out.println("i is now: " + i);
         for(int j = 1; j<=3; j++){
           System.out.println(i*j+"");
         }
          }

     
    //Write a Java program that prints all the even numbers between 1 and 100, and also calculates the sum of these even numbers.
    int total = 0;
    for(int i = 1; i<=100; i++){
        if(i % 2 == 0){
            System.out.println(i);
            total=total+i;
        }
    }System.out.println(total);
    
    //Write a Java program that prints a multiplication table from 1 to 10. Each row should represent the multiplication results for one number, and each column should show the result of multiplying that number by another number from 1 to 10.
    for(int i = 1; i<=10; i++) {
        for(int j = 1; j <= 10; j++) {
            System.out.print(i+" x "+j+" = "+i*j + " ");
        } 
        //println->print next result at next line
        //print->print next result on the same line
        System.out.println();
    }
     




  }
  
}
