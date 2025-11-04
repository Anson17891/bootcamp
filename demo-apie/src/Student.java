
public class Student {
//! Static Variable  ////////!!!!!!!!!!!!!!!!!!!!!!
//control the object from another dimension

public static int counter = 0;

//! Instance Variable
  private int id;
  private String name;

public Student(String name){
  this.id = ++counter; //! not = 0
  this.name = name;
}
  
public int getId(){
  return this.id;
}
public String getName(){
  return this.name;
}
public static void main(String[] args) {
  Student s1 = new Student("John");
  System.out.println(s1.getId());//1

  Student s2 = new Student("Steven");
  System.out.println(s2.getId());//2
}

}
