import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
  
  abstract double getArea();

//not use generic
  public static double totalArea(ArrayList<Shape> shapes){
    double total = 0;
  for(Shape shape:shapes){
      total+=shape.getArea();
    }
    return total;
}
  public static double totalArea3(ArrayList<Circle> circles){
    double total = 0;
  for(Circle circle:circles){
      total+=circle.getArea();
    }
    return total;
}//if want to apply to more type -> write more methods
  
//use generic.
public static <T extends Shape> double totalArea2(ArrayList<T> shapes){
  //! first <T>-> for generic's static method, 
  //! need define the range of T   i.e." extends Shape" -> define the range into Shape
  double total = 0;
  for(Shape shape:shapes){
      total+=shape.getArea();
    }
    return total;
}


  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3));

    for(Shape shape:shapes){
      System.out.println(shape.getArea());
    }

    System.out.println(totalArea2(shapes));
  }

  ArrayList<Circle> circles = new ArrayList<>(List.of(new Circle(3), new Circle(4)));
  System.out.println(totalArea2(circles));
  //System.out.println(totalArea(circles));//error, it can input Shape only, not include Circle(even parent-child)
//!difference: method1 only can be used in ONE type
//!            method2 ->more flexible
}
