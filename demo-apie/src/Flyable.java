//! Like a Contract, any class implements this interface can use its method
public interface Flyable { 
  public static int counter = 0;
  public static int sum(int x, int y){
    return x + y;
  }
  //! Interface
  // NO attribute
  // NO constructor
  // Has abstruct instance method (no concrete method)
  // One interface can be with more than one abstract method
  // Can with static variable
  // Can with static method

  //\/ implicitly is a abstract method
  void fly();
  //void walk();  <-can more than one method
  
}
