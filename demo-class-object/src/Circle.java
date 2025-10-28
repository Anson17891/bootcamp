
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
  private double radius;

  //empty const.
  public Circle(){

  }

  //all args const.
  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius(){ //nothing in (), bcoz no need to input anything!!
    return this.radius;
  }

  public void setRadius(double radius){
    this.radius = radius;
  }
  
  public double getArea(){
    return BigDecimal.valueOf(Math.PI).multiply(BigDecimal.valueOf(this.radius).pow(2))//
    .setScale(2,RoundingMode.HALF_UP).doubleValue();
  }
  
  public double Diameter(){
    return BigDecimal.valueOf(this.radius).multiply(BigDecimal.TWO)//
    .setScale(2,RoundingMode.HALF_UP).doubleValue();
  }

  public static void main(String[] args) {
    Circle c1 = new Circle(1.3);
    Circle c2 = new Circle(2.8);
    Circle c3 = new Circle(3.5);

    Circle[] arrCircles = new Circle[]{c1, c2, c3};

    BigDecimal totalArea = BigDecimal.ZERO;
      for (Circle c : arrCircles) {
        totalArea = BigDecimal.valueOf(c.getArea()).add(totalArea);
      }
      System.out.println("Total area=" + totalArea.doubleValue());



  }
}
