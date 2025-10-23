import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    
    // The way to store value: Primitives , Wrapper Class, String (17 Types)
    // Only can store 1 value

    //New way to store a set of same type of values
    int[] arr = new int[4]; // new int[4] -> array object with sequence (empty)

    // assign values into an array
    arr[0] = 100;
    //arr[1] = "hello"; of coz cannot input string
    arr[1] = 70;
    arr[2] = 2_100_000_000;
    arr[3] = -200;

    //! ArrayIndexOutOfBound
    //arr[-1] = -200; error, cannot locate array [-1]
    //arr[4] = -200;

    //for loop to read array
    for(int i = 0; i < 4; i++){
      System.out.println(arr[i]);
    }

    //long array with length 3
    // 99, 5, 40
    long[] arr2 = new long[3];
    arr2[0] = 99L;
    arr2[1] = 5L;
    arr2[2] = 40L;
    //print even number in arr2
    for(int i = 0; i < 3; i++){
      if(arr2[i] % 2 == 0){
        System.out.println(arr2[i]);
      }else{System.out.println("is odd");}
    }

    //array doesnt have much tools
    System.out.println(arr2.length); //3

    // boolean array, length 4
    //f,t,f,t
    boolean[] arr3 = new boolean[4];
    arr3[0] = false;
    arr3[1] = true;
    arr3[2] = false;
    arr3[3] = true;

    //forloop, count number of false
    int falseCount = 0;
    for(int i = 0; i < 4; i++){
      if(arr3[i] == false){
      falseCount++;
       }
    }System.out.println(falseCount);
    
    int[] arr4 = new int[5];
    arr4[0] = 10;
    arr4[1] = -4;
    arr4[2] = 90;
    arr4[3] = 100;
    arr4[4] = -20;
    int largerValue = arr4[0];
    int lessValue = arr4[0];
    int maxIndex = 0;
    //for loop-> find the max value
    for(int i = 0; i < 5; i++){  //better: i < arr4.length
      if(arr4[i] > largerValue){
        largerValue = arr4[i];
        maxIndex = i;
      }else if(arr4[i] < lessValue){
        lessValue = arr4[i];
      }
    }System.out.println(largerValue);
    //find the index of the max value
    System.out.println(maxIndex);
    //Find the min
    System.out.println(lessValue);


    //! String array

    String[] names = new String[3];
    names[0] = "John";
    names[1] = "Jennie";
    names[2] = "Steve";

    for(int i = 0; i < names.length; i++){
      System.out.println(names[i]);
    }

    // loop: FInd name startsWith J, print their name
    //names -> Array
    //names[i] -> String  -> can use .startsWith()
    for(int i = 0; i < names.length; i++){
      if(names[i].startsWith("J")){ //if dont want J, can be "!names[i].sW("J")"
        System.out.println(names[i]);
      }
    }

    //loop, find name with substring nn, print their name
    for(int i = 0; i < names.length; i++){
      if(names[i].contains("nn")){ //!alt: if(names[i].indexOf("nn")!=-1){}
        System.out.println(names[i]);
      }
    }

    // charAt
    //!Find the index of 'e' for each name, put them into an array
int eCount = 0;
    for(int i = 0; i < names.length; i++){
      for(int j = 0; j < names[i].length(); j++){
        if(names[i].charAt(j) == 'e'){
          eCount++;
        }
      }
    }
      int[] arr10 = new int[eCount];
      int idx = 0;
      for(int i = 0; i < names.length; i++){
      for(int j = 0; j < names[i].length(); j++){
        if(names[i].charAt(j) == 'e'){
          arr10[idx] = j;
          idx++;

      }
    }
  }
  //! Print an array -> Arrays.toString()
  System.out.println(Arrays.toString(arr10)); 

  //search + count
  String n1 = "Mandy";
  //Count the number of 'd'
  int dCount = 0;
  for(int i = 0; i < n1.length(); i++){
    if(n1.charAt(i) == 'd'){
      dCount++;
    }
  }System.out.println(dCount);
  






  }
  
}
