public class DemoStatic {
  //! static variable
  public static String content = "";


  //! Final variable
  public final String https = "https";

  //! Static final variable (used for constance/definition)
  public static final int HOURS_PER_DAY = 24;//!naming: capital letter + snake case


  //! Object's method can access static variable & method
  //! Static method cannot access objects


  private int x;
  private int y;

  public DemoStatic(int x, int y){
    this.x = x;
    this.y = y;
  }
  public DemoStatic(){}

  public static void main(String[] args) {
    // Call static variable
    content += "abc";
    content += "def";
    System.out.println(content);//abcdef

    //Formally Call static variable
    System.out.println(DemoStatic.content);//still abcdef //!static var have to be public
  
    //!Call static method
    System.out.println(DemoStatic.sum(10, 3)); //!!!!!! Call method by class
  
    //!Call instance method
    DemoStatic ds = new DemoStatic(); //!!!!!! Call method by object
    System.out.println(ds.substract(10, 3));
  

  //!Call instance method with constructor
    DemoStatic ds2 = new DemoStatic(10, 3);
    System.out.println(ds2.multiply());


    //! Call Final variable
    DemoStatic ds3 = new DemoStatic();
    System.out.println(ds3.https);//"https"
    //ds3.https = "hello" //!error, final variable cannot be reassigned

//! Still can call static final var
    System.out.println(DemoStatic.HOURS_PER_DAY);//24
}

  public static int sum(int x, int y){//! static method
    return x + y;
    //! Static method cannot access objects
    //return x + y + this.x; //!static method belongs to class, but not object
  }

  public int substract(int x, int y){ //!instance method
    return x - y;
  }

  public int multiply(){ //!w/o parameter
    return this.x * this.y;
  }
}
