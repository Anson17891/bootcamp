import java.util.Arrays;

public class Teacher2 {
    private Candy1[] candies;
  private Student2[] students;

  public Teacher2(){
this.candies = new Candy1[0];
this.students = new Student2[0];
}

 public void distributeCandy(){
if (students.length == 0) {
    System.out.println("No students to distribute candy to.");
    return; //thx to copilot
}
  
      int idx = 0;
while(idx < this.candies.length){ //thx to copilot
          for( Student2 student : students){
              if(idx >= this.candies.length){
                  break;
              }
              else{
                  student.addCandy(this.candies[idx]);
              this.candies[idx] = null;
              idx++;
              }
          }
      }
 }
      
        
 public int countCandy(){
     int counter = 0;
     for(Candy1 candy : this.candies){
         if(candy != null){
             counter++;
         }
     }return counter;
 }
 
  

  public static void main(String[] args) {
 Student2 s1 = new Student2("Albert");
 Student2 s2 = new Student2("Betty");
 Student2 s3 = new Student2("Christopher");
 Student2 s4 = new Student2("Daisy");
 Student2 s5 = new Student2("Edmond");
 Student2[] F5A = {s1, s2, s3, s4, s5};
 Candy1 c1 = new Candy1("Red");
 Candy1 c2 = new Candy1("Madder");
 Candy1 c3 = new Candy1("Brink pink");
 Candy1 c4 = new Candy1("Crimson");
 Candy1 c5 = new Candy1("Pink");
 Candy1 c6 = new Candy1("Salmon Pink");
 Candy1 c7 = new Candy1("Cardinal");
 Candy1 c8 = new Candy1("Apple red");
 Candy1 c9 = new Candy1("Zarqa");
 Candy1 c10 = new Candy1("Poppy red");
 Candy1 c11 = new Candy1("Batorange");
 Candy1 c12 = new Candy1("Carmine");
 Candy1 c13 = new Candy1("Spanish red");
 Candy1 c14 = new Candy1("Rusty red");
 Candy1 c15 = new Candy1("Chocolate cosmos");
 Candy1 c16 = new Candy1("Rosewood");
 Candy1 c17 = new Candy1("Imperial red");
 Candy1 c18 = new Candy1("Cordovan");
 Candy1 c19 = new Candy1("Fire engine red");
 Candy1 c20 = new Candy1("Rose vale");
 Candy1 c21 = new Candy1("Old rose");
 Candy1 c22 = new Candy1("Bittersweet shimmer");
 Candy1 c23 = new Candy1("Light red");
 Candy1[] candyBox = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23};
 Teacher2 t1 = new Teacher2();
 t1.students = F5A;
 t1.candies = candyBox;
 t1.distributeCandy();
 for(Student2 student : F5A){
     System.out.println("Student " + student.getName() + " has " + student.getCandies().length + " candies.");
     System.out.println("He/She has the candies with color: " +  Arrays.toString(student.getCandies()));
 }
 System.out.println("Teacher has now " + t1.countCandy() + " candy, SO SAD.");
    }


  }


