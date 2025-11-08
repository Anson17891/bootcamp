import java.util.Arrays;
import java.util.Random;

public class Teacher {
  public static int candyCount = 23;

  private Student[] students;
  //! For bonus question-------------\/
  private static final String[] CANDY_COLORS = new String[] {"Red", "Blue", "Yellow"}; //!!!!!!!!!!!

  private Candy[] candies;
public Teacher(int candyCount){
  this.candies = new Candy[candyCount];
  for(int i = 0; i < this.candies.length; i++){
  // this.candies[i] = new Candy("Blue");

  //for random color
  String randomColor = CANDY_COLORS[new Random().nextInt(3)];
this.candies[i] = new Candy(randomColor);
  }
}

public void distributeAll(Student[] students){
//remove teacher's candy
//call distribute()
int candyIdx = 0;
while(candyIdx < this.candies.length){//teacher's candy (0-22)
  for(Student student : students){
    Candy candy = this.candies[candyIdx];
this.candies[candyIdx] = null; //remove tracher's candy
    if(++candyIdx >= this.candies.length){
      break;
    }
    this.distribute(student, candy);
  }
}
}

  public void distribute(Student student, Candy candy){
  student.receiveCandy(candy);
  }


//!-------------------------/\

  public Teacher(){
this.students = new Student[0];

  }
  public static void main(String[] args) {
    //!Algorithm ->loop+if+break-> Performance(Time Complexity)/ Space Complexity
    Student[] students = new Student[]{new Student(),new Student(),new Student(),new Student(),new Student()};
   while(candyCount >= 0){ //--candyCount->countfrom22to0(23times), candyCount-- ->countform23,then-1
    for(int i = 0;i<students.length; i++){
     if(candyCount-- <= 0){//23->1
      break;
    }
    students[i].addCandy();
   }
//after break
    }

    //5 students, 23 candies, 
    //finally 5 5 5 4 4 candies for every student
    //design a programme to represent it

    //extra1: studnet id = 3 ->candyCount

    //!extra2: (need: Teacher.java, Student.java, Candy.java)
    //without using Static candycount, in stead ,use Teacher object to hold 23 candy
    //Candy object with color, distribute to 5 student
    //present: Teacher has no candy. Each student had his own candy with different color

    //! Candy.java (Color), Teacher (Candy)->distribute, Student (Candy)->receiveCandy
    Teacher t1 = new Teacher(37);
    Student[] student2 = new Student[]{new Student(),new Student(),new Student(),new Student()};
    t1.distributeAll(student2);
    System.out.println(Arrays.toString(student2[0].getCandies()));
    System.out.println(Arrays.toString(student2[1].getCandies()));
    System.out.println(Arrays.toString(student2[2].getCandies()));
    System.out.println(Arrays.toString(student2[3].getCandies()));
  }
}
