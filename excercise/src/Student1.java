 //5 students, 23 candies, 
    //finally 5 5 5 4 4 candies for every student
    //design a programme to represent it

    //extra1: studnet id = 3 ->candyCount

    //extra2: (need: Teacher.java, Student.java, Candy.java)
    //without using Static candycount, in stead ,use Teacher object to hold 23 candy
    //Candy object with color, distribute to 5 student
    //present: Teacher has no candy. Each student had his own candy with different color


public class Student1 {
public static int counter = 0;

//! Instance Variable
  private int id;
  private String name;
  private int candy;

public Student1(String name){
  this.id = ++counter; //! not = 0
  this.name = name;
  this.candy = 0;
}
  
public int getId(){
  return this.id;
}
public String getName(){
  return this.name;
}
public int getCandy(){
    return this.candy;
}

  public void addCandy(){
      this.candy++;
  }

}
