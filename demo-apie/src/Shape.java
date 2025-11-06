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

  //!Abstract method, let child to represent the method
  public abstract double getArea(); //!no {}


  public void setColor(String color){
    this.color = color;
  }

}
