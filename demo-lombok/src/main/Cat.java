import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
  @AllArgsConstructor
  @Getter
  @Setter
  @NoArgsConstructor //empty constructor

public class Cat {

  
    private String name;
    private int age;
    // no more need hand typing....
    //Construcutor
    //getter
    //setter....
  

  public static void main(String[] args){
    Cat c1 = new Cat("Leo", 13);
    System.out.println(c1.getName());
    System.out.println(c1.getAge());
    c1.setAge(10);

    new Cat();

  }
  
}
