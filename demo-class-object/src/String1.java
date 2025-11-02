public class String1 {
  private char[] values;

  //constructor
public String1(){
this.values = new char[0];
}

public String1(char[] values){
  this.values = values;
}
  //length()
public int length(){
  return this.values.length;
}
  //charAt(int index) return char
public char charAt(int index){
  return this.values[index];
}
  //replace(...)
  public void replace(String1 oldValues, String1 newValues){
  }
       
    
  

  //substring(...)
  public String1 substring(int start, int end){
    char[] subStr =new char[end-start+1];
      int idx = 0;
      for(int i = start; i < end+1 ; i++){
        subStr[idx] = this.values[i];
      idx++;
      }
     return new String1(subStr);
}

public String1 substring(int start){
    char[] subStr =new char[this.values.length+1];
      int idx = 0;
      for(int i = start; i < this.values.length+1 ; i++){
        subStr[idx] = this.values[i];
      idx++;
     }
     return new String1(subStr);
}
  //equals(String1 ...)
  public boolean equals(String1 otherString){
    int different = 0;
    for(int i = 0; i <=this.values.length; i++){
      different = different + this.values[i] - otherString.values[i];
    }return different == 0;
    
  }

  public static void main(String[] args) {
    String1 s = new String1("hello");

  }
  
}
