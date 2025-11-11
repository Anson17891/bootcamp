
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Circle extends Shape{
  private double radius;

//!By default, child empty comstrustor
//! would call Parent's empty constructor
  public Circle(){ 
    //super();//!<--- what is work under the programme
  }

  public Circle(double radius, String color){
    super(color); //!super go first  & not this.color
    this.radius = radius;
  }

  public double getArea(){
    return BigDecimal.valueOf(this.radius).pow(2).multiply(BigDecimal.valueOf(Math.PI)).setScale(2,RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(3.5, "RED");
    Circle c2 = new Circle();

    System.out.println(c1.getColor());
  }

}
