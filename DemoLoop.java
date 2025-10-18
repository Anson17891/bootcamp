public class DemoLoop {
  public static void main(String[] args) {
    
    // flow (linear)->if-else (branch)
    // loop (for / while)

    int x = 3;
    x *= 3;
    x *= 3;
    System.out.println(x);
    //tidious if * 100000times

    //solution
    //for-loop
    // (initialization; continue criteria; modifier)
    for (int i = 0; i < 3; i++) { //i++ five times
      System.out.println("Hello");
    }
    //Step 1: int i = 0
    //Step 2: i < 3? ->yes
    //Step 3: print hello
    //Step 4: i++
    //Step 5: i < 3? ->yes
    //Step 6: print hello
    //Step 7: i++ (i=2)
    //Step 8: i < 3 ? ->yes
    //Step 9: print hello
    //Step 10: i++ (i=3)
    //Step 11: i < 3 ? No
    //Step 12: Exit loop
    //! int i = 0  better start than i = 1

    // loop -> 0,1,2,3,4,5 -> total=15
    int total = 0;
    for (int j = 0; j < 6; j++){
      total = total + j;
     }
     System.out.println("total=" + total);

     // for loop + if (1-10,print odd number only)
     for (int k = 0; k < 11; k++){
      if (k % 2 == 1) {
        System.out.println(k);
      }
     }

     //! use if as a filter

     //sum up all even numbers betwwn 0 -20
     int total2 = 0;
     for (int l = 0; l < 21; l++){
      if (l % 2 == 0) {
      total2 = total2 + l;
      }
    }System.out.println(total2);

    // 0-100, summp all number that divided by 3
    int total3 = 0;
    for (int m = 0; m < 101; m++){
      if (m % 3 == 0) {
        total3 += m;
      }
    }System.out.println(total3);

    // 0-50, the difference bertween the sum of event number and the sum of odd number
    int totalEven = 0;
    int totalOdd = 0;
    for (int n = 0; n < 51; n++){
      if(n % 2 == 0){
        totalEven += n;
      }
      else{
        totalOdd += n;
      }
    } System.out.println(totalEven - totalOdd);

    // 0-20, sum up all even numbers; 21-50, sumup all odd numbers; find the product of them
    int evenNum = 0;
    int oddNum = 0;
    for (int o = 0; o < 51; o++){
      if(o <= 20){     //not o<21, for business meaning, explicit numver aligns the requirment(20)
        if(o % 2 == 0){
          evenNum = evenNum + o;
        }
      }
      if(o >= 21){
        if(o % 2 == 1){
          oddNum = oddNum + o;
        }
      }
    }System.out.println(evenNum * oddNum);

    //answer
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 51; i++){
      if (i <= 20){
        if(i % 2 == 0){
          evenSum += i;
        }
      }else if (i >=21 && i<=50){ //alt representation (using &&), but may couse error
        if (i % 2 == 1) {          //! attention to "else if"
          oddSum += i;
        }
      }
    }
    System.out.println(evenSum * oddSum);







     }
}

