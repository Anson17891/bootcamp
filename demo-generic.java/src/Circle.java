public class Circle extends Shape{
  private int radius;
  
  public Circle(int radius){
    this.radius = radius;
  }

  public int getRadius(){
    return this.radius;
  }

  @Override
  public double getArea(){
    return Math.PI*this.radius*this.radius;
  }

}
