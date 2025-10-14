public class DemoIf {
  public static void main(String[] args) {

    int x = 3;
    if(x > 10) {
      System.out.println("hello");
    } else {
      System.out.println("Goodbye");
    }
    if (x >= 4) {
      System.out.println("x is larger than 4"); //skip
      }

      // AND OR
      int y = 10;
      if(x > 2 && y < 20) { // true &&(AND) true -> true
        System.out.println("hello"); 
      }
      if( x > 4 && y < 20) {
        System.out.println("impossible");
      } else {
        System.out.println("ok");
      }
    }
  }
