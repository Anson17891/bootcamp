import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teacher {
  
  public static int candyCount = 23;

  private Student[] students;

  public Teacher(){
this.students = new Student[0];
  }
  


  public String countStudentCandy(int id){
      if(id <= 0 || id > students.length){ //thx to copilot
          return "Error 404, find no student.";
      }
      return "Student id" + id + "(" + this.students[id-1].getName() + ") has " + this.students[id-1].getCandy() + " candies";
  }
  

  
  public void distributeCandy(){
if (students.length == 0) {
    System.out.println("No students to distribute candy to.");
    return; //thx to copilot
}
      int timesOfDistribute = BigDecimal.valueOf(candyCount)//
      .divide(BigDecimal.valueOf(students.length),0,RoundingMode.UP)//
      .intValue();
      for(int i = 0 ; i < timesOfDistribute + 1 ;i++){
          for( Student student : students){
              if(candyCount==0){
                  break;
              }
              else{
              student.addCandy();
              candyCount--;
              }
          }
      }
  }
  
  
  public static void main(String[] args) {
 Student s1 = new Student("Albert");
 Student s2 = new Student("Betty");
 Student s3 = new Student("Christopher");
 Student s4 = new Student("Daisy");
 Student s5 = new Student("Edmond");
 Student[] F5A = {s1, s2, s3, s4, s5};
 Teacher t1 = new Teacher();
 t1.students = F5A;
 t1.distributeCandy();
 for(Student student : F5A){
     System.out.println("Student " + student.getName() + " has " + student.getCandy() + " candies.");
 }
 System.out.println("Teacher has now " + Teacher.candyCount + " candy, SO SAD.");

System.out.println(t1.countStudentCandy(3));
     }
  
}
