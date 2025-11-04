import java.util.Arrays;


//!Purpose: try to simulate String's design
public class String1 {
  private char[] values;

  //constructor
public String1(){
this.values = new char[0];
}

// public String1(char[] values){
//   this.values = values;
// }

public String1(String str){
    this.values = new char[str.length()];
   int idx = 0;
for (char c : str.toCharArray()){
  this.values[idx++] = c;
}
}



  //length()
public int length(){
  return this.values.length;
}

  //charAt(int index) return char
public char charAt(int index){
  return this.values[index]; //! what if index is negative?
}
  //replace(...) //! not revise this.values
  public String1 replace(char fromChar, char byChar){
    String str = "";
    for(char c : this.values){
      if(c != fromChar){
      str += c;}
    else{
      str += byChar;
    }
  }return new String1(str);
}

       
    
  

  //substring(...) //! revise this.values? no
//   public String1 substring(int start, int end){
//     char[] subStr =new char[end-start+1];
//       int idx = 0;
//       for(int i = start; i < end+1 ; i++){
//         subStr[idx] = this.values[i];
//       idx++;
//       }
//      return new String1(subStr.toString());
// }

// public String1 substring(int start){
//     char[] subStr =new char[this.values.length+1];
//       int idx = 0;
//       for(int i = start; i < this.values.length+1 ; i++){
//         subStr[idx] = this.values[i];
//       idx++;
//      }
//      return new String1(subStr.toString());
// }
public String1 subString(int fromIndex, int endIndex){
  String str = "";
  for(int i = fromIndex; i < endIndex ; i++){
str += this.values[i]; //String + char -> String
  }
  return new String1(str);
}

public char[] getValues(){
  return this.values;
}
  //equals(String1 ...)
  // public boolean equals(String1 otherString){
  //   int different = 0;
  //   for(int i = 0; i <=this.values.length; i++){
  //     different = different + this.values[i] - otherString.values[i];
  //   }return different == 0;  //!where is...if...
    
  // }

  public boolean equals(String s){
    //1.check if length are same
    //2.compare every char
    if(this.values.length != s.length()){ //! Early return (coding pattern)
      return false;
      }
      int idx = 0;
      for(char c : s.toCharArray()){
        if(this.values[idx] != c){
          return false;
        }
      }return true;
    }
  

  public static void main(String[] args) {
    String1 s1 = new String1("hello");
    String s2 = "hello";
    String s3 = "gello";
    String s4 = "helloo";
    //Testing -> design test cases so that every ling of code in the method being tested.
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s1.equals(s4));

    System.out.println(Arrays.toString(s1.subString(1, 3).getValues()));
    System.out.println("hello".substring(1, 3));

    //! System.out.println() -> automatically call object's toString()
    //!if your class has toString(), it can print directly
    System.out.println(Arrays.toString(s1.replace('e','x').getValues()));
    System.out.println("hello".replace('e', 'x'));
  }
  
}
