import java.util.Arrays;

public class DemoArraySwap {
  public static void main(String[] args){

    int x = 10;
    int y = 7;

    //Swap the values between x and y
    int temp = x; //backup x
    x = y; // backup y
    y = temp;
    System.out.println("x="+x+", y=" + y);

    //given int[]
    int[] arr1 = new int[5];
    arr1[0] = 17;
    arr1[1] = 5;
    arr1[2] = -8;
    arr1[3] = 20;
    arr1[4] = 2;
    
    // Soring in ascending order
    //{-8, 2, 5, 17, 20}

    //solution
    // Find the max value, put it at the tail of the array
    // 5, 17, -8, 20, 2
    //5, -8, 17, 20, 2
    //5, -8, 17, 2, 20
    //...
    //x, x, x, x, 20
    for(int j = 0; j < arr1.length-1; j++){
    for(int i = 0; i < arr1.length- j - 1; i++){ //! -j 
      
      if(arr1[i] > arr1[i+1]){ //! Swap
        int temp1 = arr1[i+1];
        arr1[i+1] = arr1[i];
        arr1[i] = temp1; 
      }
    }
    }System.out.println(Arrays.toString(arr1));//[5, -8, 17, 2, 20]
    //!Bubble sort

    String name = "Steven";
    //! String -> char[]
    char[] name2 = name.toCharArray(); //['S', 't', 'e', 'v', 'e', 'n']
    //Swap to "nevetS", 
    //Round 1: swap S,n
    //Round 2: swap t,e
    //Round 3: swap e,v
    char temp2;
    for(int i = 0; i < name2.length / 2; i++){ //!stop at middle 'e'<->'v'
      temp2 = name2[i];
      name2[i] = name2[name2.length - 1 - i];
      name2[name2.length - 1 - i] = temp2;
    }
    System.out.println(Arrays.toString(name2));
    //!char[] -> String
    System.out.println(String.valueOf(name2));


  }
  
}
