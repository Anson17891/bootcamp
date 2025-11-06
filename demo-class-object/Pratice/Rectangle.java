// Create a Java class named Rectangle that represents a geometric rectangle. The class should include:

// Two private fields: width and height (both double).
// A constructor to initialize both fields.
// Getter methods for width and height.
// A method getArea() that returns the area of the rectangle.
// A method getPerimeter() that returns the perimeter of the rectangle.

// Then, write a main method to create an instance of Rectangle, and print its area and perimeter.
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle {
    private double width;
    private double height;
    
public Rectangle(double width, double height){
    this.width = width;
    this.height = height;
}    
public double getWidth(){
    return this.width;
}    
public double getHeight(){
    return this.height;
}

public double getArea(){
    return BigDecimal.valueOf(this.width).multiply(BigDecimal.valueOf(this.height)).setScale(2, RoundingMode.HALF_UP).doubleValue();
}
public double getPerimeter(){
    return (BigDecimal.valueOf(this.width).add(BigDecimal.valueOf(this.height))).multiply(BigDecimal.TWO).doubleValue();
}//you might also consider using it for perimeter to maintain consistency.

//A method to check if the rectangle is a square.
  public boolean isSquare(){
    	return Double.compare(this.width, this.height) == 0;
	}

//A method to compare two rectangles by area.
   public int compareArea(Rectangle other){
    	return Double.compare(this.getArea(), other.getArea());
	}
//It is the recommended way to compare doubles over using the == operator, which can be unreliable due to floating-point inaccuracies.

public static void main(String[] args){
    Rectangle r1 = new Rectangle(12.2, 42.1);
    System.out.println(r1.getArea());
    System.out.println(r1.getPerimeter());
} 

}
