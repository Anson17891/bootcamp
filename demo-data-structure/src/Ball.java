
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private int value;

  //compare this.ball vs ball
  //eg. Yellow->Blue->Red
  //!-1=this.ball, 1=ball
  @Override
  public int compareTo(Ball ball){ //Comparable<T> calls compareTo(T o), need to override compareTo
    if(this.color == Color.YELLOW)
      return -1;
    if(ball.getColor() == Color.YELLOW)
      return 1;
    if(this.color == Color.BLUE)
      return -1;
    if(ball.getColor() ==Color.BLUE)
      return 1;
    return -1; //this.color is red (only possibility after running upper ifs)
  }

  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }
  
  public Color getColor(){
    return this.color;
  } 
  public int getValue(){
    return this.value;
  } 
  @Override
  public String toString(){
    return "Ball( Color="//
           + this.color//
           +" ,Value="//
           +this.value//
           +")";
  }


  public static enum Color{//class in a class (static class)
    RED, YELLOW, BLUE,;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball(Color.RED, 10);
    Ball b2 = new Ball(Color.YELLOW, 20);
    Ball b3 = new Ball(Color.BLUE, 8);

    ArrayList<Ball> balls = new ArrayList<>(List.of(b1,b2,b3));

    System.out.println(balls.toString());

//!Sorting
    Collections.sort(balls);//mutable
    System.out.println(balls.toString());
  }
}
