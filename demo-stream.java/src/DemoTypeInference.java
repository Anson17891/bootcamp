import java.util.ArrayList;
import java.util.Optional;

public class DemoTypeInference {
  public static void main(String[] args) {
    //Java 10
    int x= 3;
      //x = 3.5;
    //! x has been definded as int, cannot redefine the type of x again
    
    var y = 10;
    System.out.println(y);

    var name = "Jenny";
    System.out.println(name);

    var ages = new int[] {10, 3, 9};

    var email = Optional.of("Peter@gmail.com");

    var apples = new ArrayList<>();


    //! "var" supports implicitly original type at first assignment
    //! aka: value assignment(Right hand side) decides the type of reference (Left hand side)

    //apples =10 //!error, apples is definded as ArrayList (line 19)

    //! Java is a Static (Compile) and Strong type (Explicit conversion) language
    int score;
    //var score2; //!error, no right hand side


  }


  //! What var cannot do
   //! 1.cannot be a parameter
   //public static int sum(var x, var y){} //dont know x,y type -> compile time error 
  //! 2. cannot be an attribute
   //public class xxx{
   // private var name;
   //}
  //! 3. cannot be return type
  //public static var sum(int x, int y){}
}
