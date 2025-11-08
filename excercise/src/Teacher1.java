import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teacher1 {
  
  public static int candyCount = 23;

  private Student1[] students;

  public Teacher1(){
this.students = new Student1[0];
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
          for( Student1 student : students){
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
 Student1 s1 = new Student1("Albert");
 Student1 s2 = new Student1("Betty");
 Student1 s3 = new Student1("Christopher");
 Student1 s4 = new Student1("Daisy");
 Student1 s5 = new Student1("Edmond");
 Student1[] F5A = {s1, s2, s3, s4, s5};
 Teacher1 t1 = new Teacher1();
 t1.students = F5A;
 t1.distributeCandy();
 for(Student1 student : F5A){
     System.out.println("Student " + student.getName() + " has " + student.getCandy() + " candies.");
 }
 System.out.println("Teacher has now " + Teacher1.candyCount + " candy, SO SAD.");

System.out.println(t1.countStudentCandy(3));
     }
  
}
