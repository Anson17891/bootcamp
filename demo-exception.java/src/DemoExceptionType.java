import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoExceptionType {
  //Introduce common exceptions
  public static void main(String[] args) {
    //Math
    int count = 0;
    try{
    double average = 10/count;//ArithmeticException   //in real world, use if-else to avoid error
    System.out.println(average);
  }
    catch(ArithmeticException e){
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
        //lastChar(null);//runtime error -> NPE
        //-1lastChar("");//runtime error -> s.charAt(-1);-> ArrayIndexOutOfBoundsException
    } catch (NullPointerException e) {
      System.out.println("Null Pointer Exception");
    } catch (ArrayIndexOutOfBoundsException e){ //catch second error ~elseif
      System.out.println("Array Index Out of Bound");
    }

    //5. NumberForExeption
    Integer x = null;
    Integer x2 = null;
    try{
    x = Integer.valueOf("100");
    x2 = Integer.valueOf("abc");//error
    }catch(NumberFormatException e){
      System.out.println("NumberFormatException. " + e.getMessage());
      System.out.println("x=" + x);//if no line47->error
      System.out.println("x2=" + x2);
    }

    //!6. IllegalArgumentException (IAE)
    Scanner s = new Scanner(System.in);
    try{
      System.out.println("Please input the age:");
      int age = s.nextInt();
    double fee = calculateFee(age);
    }catch(IllegalArgumentException e){
      System.out.println("Calculate Fee Process Error: " +e.getMessage());
    }finally{//no matter how the try result, run finally
      s.close();
    }

    //Real life metaphore:
    //send email to customer
    //fall back stock
    //return debit amount the credit card

    //! Uncheck Exception vs Fully Checked Exception(must have try-catch)
    //can be avoid        vs really accident
    //eg.null, /0...      vs IAE,IOException...

    //!IOException -> File Not Found Exception

    try{
    File file = new File("E://file.txt");
    FileReader fr = new FileReader(file); //if no try-catch , this line cannot compile
    }catch(FileNotFoundException e){}


    
}

  public static double calculateFee(int age){
    if(age<0)
      throw new IllegalArgumentException("Age should be >= 0.");
    if(age>65)//age cannot be negative
      return 2;
    return 10;
  }

  public static char lastChar(String s){
    if(s==null)
      throw new IllegalArgumentException("s cannot be null");
    return s.charAt(s.length()-1); 
  }
}
