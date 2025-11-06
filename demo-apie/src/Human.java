
import java.time.LocalDate;

public class Human { 
  private double weight; //for using Double weight-> become Object, can null
  private double height;//primitive-> cannot null, double's default value = 0.0

  public LocalDate dateOfBirth;



  public Human(double weight, double height){
    this.weight = weight;
    this.height = height;
  }

  public Human(double weight, double height, LocalDate dateOfBirth){
    this.weight = weight;
    this.height = height;
    this.dateOfBirth = dateOfBirth;
  }


  public Human(){
    
  }

  public double getWeight(){
    System.out.println("Human's getWeight");
    return this.weight;
  }
  public double  getHeight(){
    System.out.println("Human's getHeight");
    return this.height;
  }

  public void setWeight(double weight){
    System.out.println("Human's setWeight");
    this.weight = weight;
  }

  public void setHeight(double height){
    System.out.println("Human's setHeight");
    this.height = height;
  }

  public LocalDate getdateOfBirth(){
    return this.dateOfBirth;
  }
  
  public static void main(String[] args) {
    Human h1 = new Human(73, 176.0);
    Human h2 = new Human();
    System.out.println(h2.getWeight());//0.0

    Student s1 = new Student("John");
    s1.setHeight(180);  //s1 extends human , so also has height,weight
    s1.setWeight(72.5);
    s1.setName("Jennie"); //of cause can call its own method
    System.out.println(s1.getWeight());
    System.out.println(s1.getHeight());
    System.out.println(s1.getName());


    Human h3 = new Human(78, 181, LocalDate.of(1999, 10, 31));
    System.out.println(h3.getdateOfBirth());//1999-10-31
    System.out.println(h3.getdateOfBirth().getMonth());//OCTOBER

    LocalDate ld1 = LocalDate.of(2000, 1, 31);
    System.out.println(ld1.plusWeeks(2L));//input default is long   //2000-2-14
    System.out.println(ld1);//2000-01-31

    System.out.println(ld1.isBefore(LocalDate.of(2000,1,20)));//False
    System.out.println(ld1.isAfter(LocalDate.of(2000,1,20)));//True
    System.out.println(ld1.isLeapYear());//Ture

    //! Most of the calss design won't revise itself value(eg. LacalDate, BigDecimal, String...)
    //!Except: StringBuilder(for increasing speed), StringBuffer...
    //eg. sb.append("a");
  }


}
