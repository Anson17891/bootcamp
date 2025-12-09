//Not so important
//pros: use less space , (only use one variable)
public class DemoRecursion {
  public static void main(String[] args) {
    //n=100
    //1+2+3+4+5+...+100

    //1.use for loop
    int total = 0;
    for(int i = 1; i<=100 ; i++){
      total+=i;
    }
    System.out.println(total);

    //!2.use recursion
    System.out.println(sum(100));


    //Positive num: 2+4+6+...+n
    try{
    System.out.println(sumOfEven(10));
    System.out.println(sumOfEven(9));
    }catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }


    //!Non tail recursion
    String[] customers = {"John", "Mary"};
    order(customers);
  }

  //!2.use recursion (Tail Recursion)
  //Maze , Found shortest path, Try&error...( brute force method )
  public static int sum(int n){
    if(n<=1)  //<- only support positive num
      return 1; //!set exit
    return n + sum(n-1); //!call itself
  }
  //round1 sum(100) =  100+sum(99)
  //round2 sum(99) = 99+sum(98)
  //...
  //roundLast sum(1) = 1

  public static int sumOfEven(int n){
    if(n%2==0){
      if(n<=2)
        return n;
      return n + sumOfEven(n-2);
    }
    throw new IllegalArgumentException("n cannot be odd number");
  }

   //! Non-Recursion
   public static void order(String[] customers){
    // index
    int idx = customers.length-1;
    order(customers, idx);
   }

   public static void order(String[] customers, int idx){  //idx important for recursion
    //confirm order
    if(idx < 0)
      return; //exit void method
    System.out.println("Confirm Order for " + customers[idx]);
    order(customers, idx - 1); //!recursion
    //send email
    System.out.println("Send Email for " + customers[idx]);
   }




  
 
}
