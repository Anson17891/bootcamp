import java.util.Arrays;

public class DemoObject {
  public static void main(String[] args) {
    //! Parent vs Child:
    //1. Child object can be assigned to Paren Object reference
    
    //eg.
    String s = "hello";
    Object o = "hello"; //!Object is the HIGHEST class ->Parent of all other classes
    Object o2 = new Warrior();
    Shape sh1 = new Circle();
    // Student stu = "hello";   error, student is not string's parent


    Object[] things = new Object[3];
    things[0] = new Warrior();
    things[1] = new String("hello");
    things[2] = new Square(3.4, "Blue");
    
    //!Polymorphism
    //Square -> getArea()?
    //things[2].getArea(); //!error, runtime ok, compile time not ok
    //thing[0].attack(new Warrior());//!error
    //Parent dont have child's own methods
    //Parent has least # of method
    //Parent cannot call child's methods
    //!Compile Time (The time you writing the code)
    Square sq1 = new Square(3.4, "Blue");
    sq1.getArea();

    //Shape is an abstract class(see Sahpe.java)
    //Object class > Shape class > Circle class



  }
  
}
