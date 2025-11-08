public class Student2 {
  public static int counter = 0;

  private int id;
  private String name;
  private Candy1[] candies;

public Student2(String name){
  this.candies = new Candy1[0];
  this.id = ++counter; 
  this.name = name;
}
  
public int getId(){
  return this.id;
}
public String getName(){
  return this.name;
}
public Candy1[] getCandies(){
    return this.candies;
}
public void addCandy(Candy1 gift){
      Candy1[] newCandyGain = new Candy1[this.candies.length + 1];
 for (int i = 0; i < this.candies.length; i++) {
        newCandyGain[i] = this.candies[i];
    }
      newCandyGain[this.candies.length] = gift;
      this.candies = newCandyGain;//dont forget to reassign!!!
  }

}
