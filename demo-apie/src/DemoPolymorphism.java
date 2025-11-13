public class DemoPolymorphism {
  public static void main(String[] args) {
    //!1.Compile Time (javafile -> class file)
    //Main purpose of Parent Class/ Interfacce -> Polymorphism
    Shape shape1 = new Circle(3.4, "Red"); 
    //java only recognise shape1 is a Shape not Circle 
    //aka follow the ref type(Shape) to determine if the method can be called
    System.out.println(shape1.getArea());// shape1 can only use method in Shape
    //System.out.println(shape1.getArea2()); //error, getArea2() only exsist in Circle

    System.out.println(((Circle)shape1).getArea2()); //!Risky, as the object can be square
    //! if necessary, To avoid the risk by using "instanceOf", check if shape1 is circle
    
    //! Advantage:
    Shape[] shapes = new Shape[2];
    shapes[0] = new Circle(3.2, "White");
    shapes[1] = new Square(3.2, "Yellow");
    //!The area calculation is decoupled.  "Open-Close"
    double total = 0.0;
    for(Shape shape : shapes){
      total += shape.getArea();
    }
    System.out.println(total);
    
    //!2.Run Time
    //! shape.getArea() -> runtime polymorphism
    //eg. shapes[0].getArea()  method for circle
    //    shapes[1].getArea()  method for Rectangle
    //only at run "phase", do java know which method is it
  }
  
}
