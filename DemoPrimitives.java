public class DemoPrimitives {
  public static void main(String[] args) { //shortcut: main

    //8 Primitives (byte, short, int, long, float, double, char, boolean)

      //! Interger
      // int, long, short, byte
      int x = 3 ;
      System.out.println(x); //3
      x = 10; //Reassignment
      System.out.println(x);//10

      byte b2 = 127; // max value of byte
      byte b3 = -128; //max value of byte   total 256
      //! byte b4 = -129; //error
      //! byte b5 = 128; //error

      short s1 = 32767; //max  =2^15
      short s2 = -32768; //min
      //! short s3 = 32768;
      //! short s4 = -32769;
      
      //! Default using int, for 99% case
      int i1 = 2147483647; //max =2^31
      int i2 = -2147483648; //min

      // long l1 = 2^63 -1 //max

      //long>int>short>byte


      //! Decimal
      // double, float
      //10.123456789 -> double value
      double d1 = 10.123456789; // memory:10123456789&"."at thrid place
      // double -precision-> float
      //! In jave, assign double value to float variable -> error
      //! float f1 = 10.123456789; error
      float f1 = 10.123456789f;
      //^ add "f" at the end of a double value
      double d2 = 10.123456789f; //ok , double>float

      double d10 = 10.3;
      //! float f10 = d10; d10 is double(higher pricision) -> risk -> error

      //! char (signal character /u0000 to /uffff)
      // 'a' is a char value
      // assign char value into char variable
      // single quote '' for char value   ""for String value
      char c1 = 'a';
      //! char c10 = 'a '; error, "a"+"space" have 2 characters

      char gender = 'F';
      char grade = 'A';
      
      // For primitives comparison, use ==, >=, <=, !=(not equal to), >, <
      System.out.println(gender == grade); //false
      System.out.println(gender != 'M'); //true

      int score = 73;
      System.out.println(score > 70); //true

      double savingAmount = 400.5;
      System.out.println(savingAmount > 100); //true

      //! boolean
      int age = 19;
      boolean isAdult = age >= 18; // age >=18  ->event
      System.out.println(isAdult); // true
      boolean b10 = false;

      






  }
  
}
