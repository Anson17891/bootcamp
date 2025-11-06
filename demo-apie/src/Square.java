
import com.sun.source.doctree.SystemPropertyTree;
import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  public Square(double length, String color){
    super(color);
    this.length = length;
  }

  public Square(){}

  public double getLength(){
    return this.length;
  }

  //! Child class have to respond to Parent's abstract method
  @Override
  public double getArea(){
    return BigDecimal.valueOf(this.length).pow(2).doubleValue();
  }


  public static void main(String[] args) {
    //! Reason of inheritance
    //1. share common attribute (readability)

    //!2. Shape[], but not only Circle[] or Suqre[]
    //!Parent array/list can put child objects
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.5, "Red");
    shapes[1] = new Circle(2.3, "Brown");
    shapes[2] = new Square(5.0, "Black");
  
    //Calculate the total area of all shapes.
  BigDecimal total = BigDecimal.ZERO;
    for(Shape shape : shapes){
    //shape.getArea() //!if Shape dont have getArea()->error,
                      //! Java only check the class if there is the method
    //! After having abstract method in Parent class
    total = total.add(BigDecimal.valueOf(shape.getArea()));
    System.out.println(total.doubleValue());
  }
  }
}
