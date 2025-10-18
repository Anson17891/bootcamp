public class DemoIf {
  public static void main(String[] args) {

    int x = 3;
    if(x > 10) {
      System.out.println("hello");
    } else {
      System.out.println("Goodbye");
    }
    if (x >= 4) {
      System.out.println("x is larger than 4"); //skip
      }

      // AND OR
      int y = 10;
      if(x > 2 && y < 20) { // true &&(AND) true -> true
        System.out.println("hello"); 
      }
      if( x > 4 || y < 20) { //true ||(or) false -> true
        System.out.println("impossible");
      } else {
        System.out.println("ok");
      }

      // eg. max, min
      int num1 = 10;
      int num2 = 12;
      // print: max=12, min=10
      if (num2 > num1){
        System.out.println("max=" + num2);
        System.out.println("min=" + num1);
      } else {
        System.out.println("max=" + num1);
        System.out.println("min=" + num2);
      }
      

      //! if-else if-else
      /*  Score >= 90, Grade A
          Score >= 80, Grade B
          Score >= 70, Grade C
          Score < 70 , Fail
     */
    
    int score = 100;
    char grade = 'F';
    if(score >= 90){
      grade = 'A';
    }else if(score >= 80 && score < 90){ //better no overlap(only >=80) for beginner
      grade = 'B';
      }else if(score >= 70 && score < 80){
      grade = 'C';
      }else{grade = 'F'; //can ignore,as grade had set to be F
    }System.out.println(grade);


    












    }
  }
