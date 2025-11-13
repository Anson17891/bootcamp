//! Like a Contract, any class implements this interface can use its method
public interface Flyable { 
  public static int counter = 0;
  public static int sum(int x, int y){
    return x + y;
  }
//-----------------------------------
  //! Interface (Before java8)
  // NO attribute
  // NO constructor
  // Has abstruct instance method (no concrete method)
  // One interface can be with more than one abstract method
  // Can with static variable
  // Can with static method

  //\/ implicitly is a abstract method
  void fly();
  //void walk();  <-can more than one method
 //------------------------------------ 
//! Interface (After Java 8)
  //Static method
  //Default instance method

  //!Default method

  //! also a part of the contract
  default void run(){
    System.out.println("This is default run method in the Interface.");
  }
  //Good for editing afterward, eg. want to add new function without touching exsisting class
  //if no default, use" void drink()" instead, old class (Superman) must be added new method
  default void drink(){
    System.out.println("This is default drink method in the Interface");
  }
}
