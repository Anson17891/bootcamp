// Create a Java class called Student with the following properties:
// name (String)
// grade (double)
// Then:
// Create three Student objects.
// Store them in an array.
// Write a method called hasPassed() that returns true if the student's grade is 60 or above, and false otherwise.
// In the main method, use a for-each loop to print each student's name and whether they passed.
// Expected Output:
// Alice has passed.
// Bob has not passed.
// Charlie has passed.

public class Student {
  private String name;
private double grade;

public Student(String name, double grade){
    this.name = name;
    this.grade = grade;
}

 public String getName(){
     return this.name;
 }  
 public double getGrade(){
     return this.grade;
 }
 
 public boolean haspassed(){
     return this.grade >= 60;
 }
   
 public static void main(String[] args){
     Student alice = new Student("Alice", 60);
     Student bob = new Student("Bob", 59);
     Student charlie = new Student("Charlie", 60);
     Student[] students = {alice, bob, charlie};
     for(Student student : students){
         if(student.haspassed()){
             System.out.println(student.getName() + " has passed.");
         }else{System.out.println(student.getName() +" has not passed.");}
     }
     
 }  

}
