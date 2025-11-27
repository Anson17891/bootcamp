
public class StringBox {
  private String value;

  public StringBox(String value){
    this.value = value;
  }

  public String getValue(){
    return this.value;
  }

  

  public static void main(String[] args) {
    //Box of String
    //if want the Box to be box of Integer?
      //->create IntegerBox  ->what if change again and again...?
    //Need a more flexibe design for storing different types of values
      //!->Generic - Box<T>
    
    Box<String> stringBox = new Box<>("Hello");
    Box<Integer> integerBox = new Box<>(100);

    //! Generic just help to avoid creating multiple classes with same logic, but not allow to change the type of box.
    //integerBox = "hello" //error, cannot convert from string to box<integer>
    // integerBox has been defined as Integer

    //If really want to define a box that store anything
    Box<Object> superBox = new Box<>("hello"); //!  Object!=T
    superBox.setValue(Double.valueOf(10.5));
    superBox.setValue("abc");
    //->Polymorphism  //!but lost all child-class's methods/properties
    //System.out.println(superBox.getValue().charAt(0)); //compile error
  }
}
