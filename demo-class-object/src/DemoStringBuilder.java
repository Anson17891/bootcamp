
import java.math.BigDecimal;



public class DemoStringBuilder {
  public static void main(String[] args) {
    String name = "John";
    String[] names = new String[]{"Peter", name, "Sally"};

    //print "PeterJohnSally"
    String total = new String();
    for(String name1 : names){
      total = total + name1;//.concat(name1) also ok
    }System.out.println(total);

    //StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append("hello");//!append not return to new, but edit old var ->no need to directed by new reference (aka sb = sb.append(xxx) )
    sb.append("world");
    System.out.println(sb.toString());//helloworld
    
    BigDecimal bd = new BigDecimal("3.5");
    bd.add(BigDecimal.TEN);
    System.out.println(bd); //!result still 3.5     <-bd.add() return to new ref
    bd = bd.add(BigDecimal.TEN);
    System.out.println(bd);


    //! Merits
    //! Performance of String concat
    long before = System.currentTimeMillis();
    String result = "";
    for(int i = 0; i < 100000; i++){
      result += "a";
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);  //!900ms

    before = System.currentTimeMillis();
    sb = new StringBuilder();
    for(int i = 0; i < 100000; i++){
      sb.append("a");
    }
    after = System.currentTimeMillis();
    System.out.println(after - before); //!4ms  ^much faster

//! ^^^^Rarely use, in reality, only concat couple of strings^^^^
//how 'bout other method?




    //Literal pool   / immutability of String
    String s1 = "hello";//!s1 and s2 direct to the same object
    String s2 = "hello"; //! "hello"-> reuse original string object in string pool
    System.out.println(s1 == s2); //true
    //s2 = "hello world"; //s2 now direct to another object, not change the origin object(hello)
    s1 = new String("hello"); //! Create a new String object
    System.out.println(s1 == s2);//false

//! So,   result += "a"; (line35) so slow, becoz it CREATES new object*100000

    s1 = String.valueOf("hello");//! it search string pool
    System.out.println(s1 == s2);//!True


    
  }
  
}
