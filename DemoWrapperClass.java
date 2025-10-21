public class DemoWrapperClass {
  public static void main(String[] args) {
    

    // 8 Primitives
    //Each Primitives Type has its corrsponding Wrapper Class

    // !int -> Integer
    // short -> Short
    // !long -> Long    //!try more tools
    // byte -> Byte
    // !char -> Character
    // !boolean -> Boolean
    // float -> Float
    // !double -> Double

    Integer x = 3;// 
    int y= 3; //storing the value result only

    //Advantage
    double x2 = x.doubleValue();
    System.out.println(x2); //3.0(double)
    System.out.println(x); //3(int)
    String x3 = x.toString(); //int directly change to sting
    //x can be everything

    //!Dont use WrapperClass unnessasaryly, always use simplest one
    //Disavantage
    //x = null; Integer x can be null
    //byte b1 = x.byteValue(); //error
    //y = null; int y cannot be null
    //int k; assign k = null
    //System.out.println(k); error, assign value before reading the variable

    // equals()
    //! Never use i, j, k as local variable, they are for FOR loop
    //Integer i = 0;
    //for (int i = 0; i < 10; i++) {} //error i has been declared
    Integer i1 = 7;
    Integer i2 = 8;
    System.out.println(i1 == i2);// Integer == Integer -> int == int
    //!Unnessasaryly used, == is for primitives
    System.out.println(i1.equals(i2));//!use tools instead
    System.out.println(i1.compareTo(i2));

    i1 = 200;
    byte b2 = i1.byteValue();//similar to downcasting
    System.out.println(b2);// -56, still has overflow


    //!Character
    Character c1 = 'a'; //auto-box (primitive value-> wrapper class object)
    char c2 = c1; //un-box

    System.out.println(c1.compareTo('a'));//0 same result
    System.out.println(c1.compareTo('c'));// -2 ('a'-'c') same result
    System.out.println(c1.equals('a'));

    System.out.println(Character.isAlphabetic('a')); //true
    System.out.println(Character.isDigit('p'));//false
    //no need to know'em all

    //eg. check lowercase
    char c3 = 'a';
    //approach1
    if (c3 >= 97 && c3 <= 122){
      System.out.println("is lowercase");
    }
    //approach2
    System.out.println(Character.isLowerCase(c3));//true

    //! Double
    Double d1 = 1.5;
    double d2 = d1;
    //covert to int/Integer?
    int i3 = d1.intValue();
    Integer i4 = d1.intValue();
    System.out.println(i3);//1 precision loss, same result
    System.out.println(i4); //1
    

    //!Other ways to create an object of Integer
    Integer i5 = Integer.valueOf(9);
    Integer i6 = new Integer(9);
    Integer i7 = 9;

    // naming: Primitive
    // int x = 3;
    // x : variable  / 3 : int value

    // naming: non-Primitive
    // String s = "hello"
    // s : object reference / "hello" : String object
    // String: type (aka class)
    String s = String.valueOf("hello");
    String s1 = new String("hello");
    String s2 = "hello";
    System.out.println(s);
    System.out.println(s1);
    System.out.println(s2);


  }
  
}
