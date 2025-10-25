public class DemoMethod {
  public static void main(String[] args) {
    
    //method (=Function in math)
    int x = 10;
    int y = x + 3; // f(x)=x + 3

    //! Method caller
    //call method "sum" wrote below
    int result = sum(50 , 99); //variable can use no matter with method below
    System.out.println("result = " + result);//149

    result = sum(-3, 99);
    System.out.println(result);//96

    //Testing
    System.out.println(totalLength("hello", "Leo"));//8
    System.out.println(isValidString("hello world!"));//true(>10)
    System.out.println(isValidString("helloworld!"));//false(<10)
    System.out.println(multiplyNum(10));//30
    System.out.println(multiplyNum(11));//22

    int[] arr = new int[]{1,2,3,4,5};
    System.out.println(findMax(arr));//5

    String[] arr1 = new String[]{"hello","world","well"};
    System.out.println(countLl(arr1));//2













  }
  // \/method\/
  //1. sum -> method name ( can be anything) //! use verb as beginning (is, find, get, ....)
  //2. (int x, int y) -> parameter (and their type), aka f(x,y)
  //3. int -> return type (what is the type of f(x,y))
  //4. return -> end method

  public static int sum(int x, int y){
    int result = x + y;
    return result; //"result" is int 
  } //alt: return x + y;

  //Design a method, Given 2 strings, sum up their length, areturn it
  public static int totalLength (String a, String b){ //expected result is an int
    int totalLength = a.length() + b.length();
    return totalLength; //alt: return a.length() + b.length()
  }

  //Design a method, Given a String value, check if its length > 10, return true/false
  public static boolean isValidString (String s1){
    //boolean result;
    //if (s1.length() > 10){
      //result = true;
    //} else{
      //result = false;
   //}
      //return result;
          return s1.length() > 10; 
  }

  //Design a method, Given a int value, if it's odd num, return this num * 2; if it's even num, return this num * 3
  public static int multiplyNum (int i1){
    if(i1 % 2 == 0){
      return i1 * 3;
    }else{
      return i1 * 2;
    } //alt:  return x % 2 == 1 ? x * 2 : x * 3;   //. ?->if :->else  only avalible for "if-else" 
  }

  //Given an int array, find and return the max value of it
  public static int findMax (int[] arr){
    int maxValue = arr[0];
    for(int i = 0; i < arr.length; i++){
      if(maxValue < arr[i]){
        maxValue = arr[i];
      }
      //alt. max = Math.max(arr[i], max);
  }return maxValue;
  }

  //GIven a String array, count the number of String value that contains "ll"
  public static int countLl (String[] arr){
    int llCounter = 0;
      for (int i = 0; i < arr.length; i++) {
          if (arr[i].contains("ll")) {
              llCounter++;
          }
      //alt:
      //for(String s : arr){
      //if(s.contains("ll")){
        //countLl++;
      //}}
      }
  return llCounter;
    }












}
