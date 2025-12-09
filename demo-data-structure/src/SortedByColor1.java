import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortedByColor1 implements Comparator<Ball>{

  //Blue->Red->Yellow
  //-1=b1, 1=b2
  @Override
  public int compare(Ball b1, Ball b2){ //Comparator calls compare()
    if(b1.getColor() == Ball.Color.BLUE)//not in Ball, need to call Ball.Color
      return -1;
    if(b2.getColor() == Ball.Color.BLUE)
      return 1;
    if(b1.getColor() == Ball.Color.RED)
      return -1;
    if(b2.getColor() == Ball.Color.RED)
      return 1;
    return -1; 
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Ball.Color.RED, 10);
    Ball b2 = new Ball(Ball.Color.YELLOW, 20);
    Ball b3 = new Ball(Ball.Color.BLUE, 8);
    
    ArrayList<Ball> balls = new ArrayList<>();
     balls.add(b1);
     balls.add(b2);
     balls.add(b3);

     Collections.sort(balls, new SortedByColor1());//now balls can sort by external method(class)->more flexible
     System.out.println(balls.toString());
  }
  
}
