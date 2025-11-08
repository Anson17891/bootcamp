
import java.time.LocalDate;


public class Student extends Human {  //extends: student has (inheritance) all attributes of human
//! Static Variable  ////////!!!!!!!!!!!!!!!!!!!!!!
//control the object from another dimension

public static int counter = 0;

//! Instance Variable
  private int id;
  private String name;
  private int candyCount;

  //! for bonus question
  private Candy[] candies;
  //!--------------------

public Student(String name){
  this.id = ++counter; //! not = 0
  this.name = name;
}
public Student(){
  this.id = ++counter;
  this.candyCount = 0;
  this.candies = new Candy[0];
}

public int getCandyCount(){
  return this.candyCount;
}

public Candy[] getCandies(){
  return this.candies;
}

public void addCandy(){
  this.candyCount++;
}

public void receiveCandy(Candy newCandy){
  Candy[] newCandies = new Candy[this.candies.length+1];
  int idx = 0;
  for(int i = 0; i < this.candies.length; i++){
  newCandies[idx++] = this.candies[i];
  }
  newCandies[idx] = newCandy;
  this.candies = newCandies;
}

public int getId(){
  return this.id;
}
public String getName(){
  return this.name;
}

public void setName(String name){
  this.name = name;
}

//!By Default, for Inheritance, child class(Student) dnot need to write parent method again
// public double getHeight(){ //<-what exactly work under the programme
//   return super.getHeight()
@Override
public double getHeight(){//!what if you rewrite it, do override 
  System.out.println("Student's getHeight");
  return super.getHeight() / 100.0;

}

public LocalDate getParentDoB() {
  return super.dateOfBirth; //no need return super.getdateOfBirth
  //bcoz Parent expose dateOfBirth (see Human.java ln9 : public LocalDate dateOfBirth)
}

public static void main(String[] args) {
  Student s1 = new Student("John");
  System.out.println(s1.getId());//1

  Student s2 = new Student("Steven");
  System.out.println(s2.getId());//2
}

}
