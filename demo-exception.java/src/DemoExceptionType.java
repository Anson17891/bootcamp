public class DemoExceptionType {
  //Introduce common exceptions
  public static void main(String[] args) {
    //Math
    int count = 0;
    try{
    double average = 10/count;//ArithmeticException   //in real world, use if-else to avoid error
    System.out.println(average);
  }catch(ArithmeticException e){
    System.out.println("Cannot not / by zero");
  }

  //Array
  int[] arr = new int[2];
  arr[0] = 100;
  arr[1] = 300;

  int idx = 2;

  try {
      arr[idx] = 1000;
  } catch (ArrayIndexOutOfBoundsException e) {
  System.out.println("Array Index Out of Bound.");
  }

  //charAt
  try {
      String s = "hello";
      s.charAt(s.length());
  } catch (StringIndexOutOfBoundsException e) {
    System.out.println("String Index Out of Bound.");
  }

  //null pointer exception NPE
    try {
        lastChar("hello");//ok
        lastChar(null);//runtime error -> NPE
        lastChar("");//runtime error -> s.charAt(-1);-> ArrayIndexOutOfBoundsException
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception");
    } catch (ArrayIndexOutOfBoundsException e){ //catch second error ~elseif
      System.out.println("Array Index Out of Bound");
    }

}

  public static char lastChar(String s){
    return s.charAt(s.length()-1); //if s is null..?
  }
}
