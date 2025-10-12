public class DemoInt{
  public static void main(String[] args){
    int x = 3;
    //int x (declaration)
    // x is a variable name
    // = 3 (assignment, assign calue 3 to vatiavle x)
    System.out.println(x); //3

    int y = 10;
    System.out.println(y);

    // decaration
    int a;
    int k; 

    //Assignment 
    a = 100;
    k = 20;

    int total = x + y;
    System.out.println(total); //13

    int baseSalary = 20000;
    int bonus = 5000;
    int totalSalary = baseSalary + bonus;
    System.out.println(totalSalary); //25000
    System.out.println(bonus); // 5000

    //discount
    // * (multiply)
    int price = 150;
    double discountRate = 0.8;
    //Naming convension : camel case : uppercase in second word
    // ! Math Operation:
    // 1. int + int -> int
    // 2. int + double -> double
    // 3. double + int-> double
    // 4. double + doulbe-> double
    //i.e 1.0 + 4.0 -> 5.0
    // 1 + 4 -> 5
    // int * double ->double
    // ! We cannot assign double value int an int varialbe
    // int finalPrine = price * discountRate;     <---problem!
    double finalPrice = price * discountRate;
    System.out.println(finalPrice); //120.0
  
    int finalPrice2 = price * 80/100;
    System.out.println(finalPrice2); //120

    int englishScore = 82;
    int mathScore = 91;
    int histroyScore = 83;
    // ! (int + int + int) / int -> int
    // double averageScore = (englishScore + mathScore + historyScore) / 3;  <-wrong
    double averageScore = (englishScore + mathScore + histroyScore) / 3.0;
    System.out.println(averageScore); // 85.3333



    // excercise:
    // int double (Data type - primitive)
    // print variable
    // math operation

    // int appleCount = 9;
    //doubleapplePrice = 5.5;
    //int orangeCount = 4;
    //double orangePrice = 6.5;
    //double discount = 0.95;
    //finalAmount?
  }
}