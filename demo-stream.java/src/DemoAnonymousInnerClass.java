public class DemoAnonymousInnerClass {
  
  public static interface Flyable{
    void fly();
  }

  public static class Superman implements Flyable{
    @Override
    public void fly(){
      System.out.println("Superman is flying...");
    }
  }
  
  public static void main(String[] args) {
    Flyable s1 = new Superman();
    s1.fly();

    //!Anonymous Inner Class
    Flyable s2 = new Flyable(){  //usually cannot create an interface object
      @Override           //!override the interface immediately
      public void fly(){
        System.out.println("Superman is flying...");
      }
    };    //!one-off object, if the class is not important/not mass-production, just want a SINGLE result
          //! pros: can override again, and each time can be different
          //! cons: single-use

    s2.fly();


  }
}
