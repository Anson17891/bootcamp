public class DemoMath {
  public static void main(String[] args) {
    //java.lang intrinsic programme in java
    double r = Math.pow(2,4.0); // 16.0   pow(double, double2)
    System.out.println(r);

    System.out.println(Math.ceil(3.1));//4.0 roundup to upper cloest integer
    System.out.println(Math.floor(3.9));//3.0 roundup to lowest cloest integer

    System.out.println(Math.PI);//3.141592653589793<-end in java

    System.out.println(Math.abs(-3));//3
    System.out.println(Math.abs(4));//4

    /*
    In java, dont have byte and short value
     assign int value into short variable
    short s1 = 1;//safe
    int x = 1;
    ! short s2 = x;//not safe, x may not be integer
    long l1 = 100L;
    long l2 = 100; //also ok, promotion int->long

    float f1 = 1.5f;
    !float f2 = 1.5;// error, value default to be double (higher precision)
    */

    int score = -4;
    System.out.println(Math.max(0, score));//0, between 0 and score, take max value
    score = 130;
    System.out.println(Math.min(100,score));//100, between 100 and score, take min value

    System.out.println(Math.round(0.1234));// 0 , always roundup the first decimal num
    System.out.println(Math.round(0.5234));//1

    double d10 = 0.1235; // want to be 0.124 \/
    System.out.println(Math.round(d10 * 1000) / 1000.0);  //!Math -> become long, have to /1000.0, change to double

    System.out.println(Math.random());// random number(0-1)





  }
  
}
