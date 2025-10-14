public class DemoOperator {
  public static void main(String[] args) {
    
    //! ++ , -- 
    int x = 3;
    x++; // ++ only for +1
    System.out.println(x); // 4   
    x += 1; // -> x= x + 1;
    System.out.println(x); // 5  (4+1)
    x = x + 1;
    System.out.println(x); // 6
    x--;
    System.out.println(x); // 5

    // ++, -- (pre/post)
    int k = 6;
    int a1 = ++k +3; // k + 1 -> k + 3 -> assign
    System.out.println(a1); // 10
    System.out.println(k); // 7
    //equals k = k++ ; a1 = k + 3;

    int j = 6;
    int a2 = j++ +3; // j + 3 ->assign -> j + 1
    System.out.println(a2);//9
    System.out.println(j); //7
    //equals a2 = j + 3; j = j++; 



    //! +=, -=, *=, /=
    int y = 8;
    y += 2;
    System.out.println(y); // 10
    y = y + 2;
    System.out.println(y); // 12
    y *= 2;
    System.out.println(y); // 24
    y /= 2;
    System.out.println(y); // 12
    //! beware of int, double
    y -= 4;
    System.out.println(y); // 8

    //! % -> remainder
    int r= 10 % 3; // 10/3=3 , remain 1
    System.out.println(r); //1

    //Note example
    int h = 3;
    int m = (h++ + 3) * h++;
    System.out.println(m); //24
    // h + 3; -> 6
    // h++ (1st);  -> h = 4
    // 6 * 4; -> m = 24
    // h++ (2nd); -> h = 5
  }
}