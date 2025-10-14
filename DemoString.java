public class DemoString {
  public static void main(String[] args) {
      //! String
      String name = "John" ;  //must use double quote ""
      String s1 = "!!@@$#$";

      //! String has + operation
      String firstName = "Jennie";
      String lastName = "Wong";
      String fullName = firstName + " " + lastName;
      System.out.println(fullName); // shortcut : sysout

      String emptyString = "";// even " " is something
      
      // ! Stiring has no - * / operations  (python has)

      //! String + "everything" -> String
      //String Value + double value -> String Value
      // Assign String calue into String variable
      String s3 = "Sally" +0.3; //String + double
      System.out.println(s3); // "Sally0.3"
      String s4 = "Leo" +102; // String + int
      System.out.println(s4); //"Leo102"
      
      //! double result = "Vincent" + 8.4;
      // ^error, String cannot into double

      //! Methods (=Functions) //uppercase eg."S"tring
      // 1. length
      String teacher = "Steven";
      System.out.println(teacher.length());//shoutcut len // =6
      // 2.isEmpty
      System.out.println(teacher.isEmpty()); // =false
      System.out.println(emptyString.isEmpty()); // =true
      // 3.equals
      String s6 = "abc";
      String s7 = "abc";
      String s8 = "abcd";
      System.out.println(s6.equals(s7));// =true
      System.out.println(s8.equals(s7));// =false

      // 4.charAt
      // The value in x position of the string
      //! Index begins at 0
      System.out.println(s8.charAt(0)); // =a
      System.out.println(s8.charAt(1)); // =b
      System.out.println(s8.charAt(2)); // =c
      System.out.println(s8.charAt(3)); // =d
      //! system.out.println(s8.charAt(4)); //error
      //! system.out.println(s8.charAt(-1)); //error









  }
}
  

