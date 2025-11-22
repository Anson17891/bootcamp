import java.util.Objects;
//!If the object has no color, then the object won't be a shape (every child classes MUST have color)

//1. Abstract class not allow to create object
//!2. Abstract class allow abstract method

public abstract class Shape {//! Abstract->cannot create new object, the object doesnot exist in real world
  private String color;

  public Shape(String color){ //still need constructor for its children
    System.out.println("Shape's all args constructor");
    this.color = color;
  }

  public Shape(){
    System.out.println("Shape's empty constructor");
  }

  public String getColor(){
    
    return this.color;
  }
//----------exercise of Override--see Square.java--
@Override
  public String toString(){
    return "Shape("//
    +"color=" + this.color
    +")";
  }
@Override
public boolean equals(Object obj){
  if (this == obj){
    return true;
  }
  if(!(obj instanceof Shape)){
    return false;
  }
  Shape shape = (Shape) obj;
  return this.color.equals(shape.getColor());
}

@Override
public int hashCode(){
  return Objects.hash(this.color);
}
//---------------------

  //!Abstract method, let child to represent the method
  public abstract double getArea(); //!no {}


  public void setColor(String color){
    this.color = color;
  }

  //! Parent Calss can return type(class).   "Factory pattern" 
  public static Shape getShape(int value){
    if (value==1){
      return new Square(1.0, "White");
    }else if(value ==2){
      return new Circle(2.5, "White");
    }
    return null;
  }
}
