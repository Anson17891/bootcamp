public class Teacher {
  public static int candyCount = 23;

  private Student[] students;

  public Teacher(){
this.students = new Student[0];

  }
  public static void main(String[] args) {
    for(Student student : students){

    }

    //5 students, 23 candies, 
    //finally 5 5 5 4 4 candies for every student
    //design a programme to represent it

    //extra1: studnet id = 3 ->candyCount

    //extra2: (need: Teacher.java, Student.java, Candy.java)
    //without using Static candycount, in stead ,use Teacher object to hold 23 candy
    //Candy object with color, distribute to 5 student
    //present: Teacher has no candy. Each student had his own candy with different color
  }
  
}
