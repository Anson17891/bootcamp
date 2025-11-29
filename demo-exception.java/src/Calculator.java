public class Calculator {
  
  //!throw -> smth happened but cannot be recovered
  public static char firstChar(String str){ //!!!!consider any posibilities of the value: if str is null,""(empty string)
    if(str == null)
    throw new RuntimeException("The parameter cannot be null."); //!throw must return certain classes (eg. exception series)
    else if("".equals(str))//!check if str is null/""  alt.: str==null||"".equals(str)
      throw new RuntimeException("The parameter cannot be empty string.");
    return str.charAt(0);
  }

  public static void main(String[] args) {
    //""-> length 0 array
    String input = "";
    try {
        char result = firstChar(input); //case1 if the error happens here, skip to rest of lines
        System.out.println("Check point 1"); //!not print, line 15 -(skip 16~17)>line 18 -...>32
        result = firstChar(null);       //case2
    } catch (RuntimeException e) { //catch the throw //! Recover
      //do smth else
        System.out.println("RunTimeException: " + e.getMessage()); //The parameter cannot be empty string.
    }

    System.out.println("Check point 2");

    //separate case2
    try{
      char result = firstChar(null);
    } catch(RuntimeException e){
      System.out.println("RunTimeException: " + e.getMessage());
    }

    System.out.println("End of program.");

    //not using throw.catch
    //System.out.println(firstChar(""));//Exception in thread "main" java.lang.RuntimeException: The parameter cannot be empty string.
    //System.out.println(firstChar(null));//not hit, programme stop at line22
  }
}
