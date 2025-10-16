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

      //null (non primitive/class)
      String s5 = "";  //!value exist \/
      System.out.println(s5.length());//0
      String s10 = null; //! value nonexist /\
      //! System.out.println(s10.length()); // error, null pointer
      //!s10.charAt(0); error

      //5. inBlank()
      String s11 = "";
      String s12 = " "; //no matter how many space
      String s13 = "Tommy";
      System.out.println(s11.isEmpty()); //true
      System.out.println(s12.isEmpty()); //false
      System.out.println(s13.isEmpty()); //false
      System.out.println(s11.isBlank()); //true
      System.out.println(s12.isBlank()); //!true
      System.out.println(s13.isBlank()); //false

      //6. substring()
      String s14 = "Hello World!";
      //substring(int1, int2) start from 0.  //index = length - 1
      System.out.println(s14.substring(6, 11)); //World
      System.out.println(s14.substring(3)); // lo World!

      //7. toLowerCase(), toUpperCase()
      System.out.println(s14.toUpperCase()); //HELLO WORLD!
      System.out.println(s14.toLowerCase()); //hello world!

      //Java -> Type dependent
      //! Chain method  (multiple
      System.out.println(s14.toUpperCase().charAt(1)); // E
      //! System.out.println(s14.charAt(1).toUpperCase()); // error, charAt ->become char, toUpperCase is for Strinng
      System.out.println(s14.substring(4).length());//10

      //8. replace()
      String s17 = "Python";
      String s18 = s17.replace("y","x");
      System.out.println(s18); //Pxthon

      //! s17.replace("y","x").toUpperCase().xxx.xxx.xxx......

      String s19 = s17.replace("th","!!!");
      System.out.println(s19); //Py!!!on

      //9. contains() -> boolean value
      System.out.println(s17.contains("Py")); //true
      System.out.println(s17.contains("py")); //false
      System.out.println(s17.contains("t")); //true
      System.out.println(s17.contains("")); //!true, emptyString is everywhere

      //10. startsWith(), endsWith()
      System.out.println(s17.startsWith("Pyt"));//true
      System.out.println(s17.startsWith("p")); //false
      System.out.println(s17.startsWith("Pytl")); //false

      System.out.println(s17.endsWith("on")); //true
      System.out.println(s17.endsWith("fon"));//false

      //11. indexOf()
      System.out.println(s17.indexOf("th"));//2
      System.out.println(s17.indexOf("tha"));//-1  //!cannot find->-1

      System.out.println(s17.indexOf('o',3)); //4   start from index 3, find 'o', 'o' at index 4
      System.out.println(s17.indexOf('n',3,4)); // -1   statr form 3, end at 4, find 'n'

      //lastIndexOf() ,find from last character
      String s20 = "hello world";
      System.out.println(s20.indexOf('l')); //2
      System.out.println(s20.lastIndexOf('l')); //9  

      //12. concat()
      String combined = "abc" + "def";
      System.out.println(combined); //abcdef
      String s21 = "abc".concat("def");
      System.out.println(s21); //! faster, for large amount of data
      System.out.println("abcd".concat("ijk".concat("xyz"))); // abcdijkxyz

      //13. equalsIsIgnoreCase()
      String student1 = "John";
      String student2 = "john";
      System.out.println(student1.equals(student2));//false
      System.out.println(student1.equalsIgnoreCase(student2)); //true

      //14. trim()
      String username = "vincentlau";
      String username2 = " vincentlau ";
      System.out.println(username2.trim().length());//10  //!trim out spaces at !first & last!
      System.out.println(username.trim().length());//10
      System.out.println(username.concat(username2).trim().length());//!21

      //15. compareTo()
      String apple = "apple";
      String banana = "banana";
      System.out.println(apple.compareTo(banana));//-1 (a-b) compare 1st letter
      String cat = "cat";
      System.out.println(cat.compareTo(apple));//2 (c-a)
      String boy = "boy";
      System.out.println(boy.compareTo(banana));// 14 (o-a) first letter is same->compare 2nd letter
      String boz = "boz";
      System.out.println(boy.compareTo(boz));//-1 (y-z)

      
















  }
}
  

