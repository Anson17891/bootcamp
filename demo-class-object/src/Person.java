public class Person {
  private Eye[] eyes;  //new class in a class
  
  //!API"E" (Encapsulation) 
  public Person(){
    this.eyes = new Eye[2]; //! Array object
    this.eyes[0] = new Eye("Black");
    this.eyes[1] = new Eye("Black");
  }

  //changeRightEyeColor(String color)
  public void changeRightEyeColor(String color){
    this.eyes[1].setColor(color);
  }


  public void setLeftEye(Eye eye){
    this.eyes[0] = eye;
  }

  public Eye getLeftEye(){
    return this.eyes[0];
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    Eye e1 = new Eye("Red");
    p1.setLeftEye(e1);   //<-create a new adress e1(line 21) that you can edit it (using .setLeftEye())
    //p1.setLeftEye(new Eye());    <-edit eye color from p1's path
    p1.setLeftEye(new Eye("Yellow"));//! p1 direct to NEW eye(yellow)
    e1.setColor("Orange"); //! e1 no matter with p1 any more  <-BUG

    System.out.println(p1.getLeftEye().getColor()); //!Yellow, NOT ORANGE
  }


 
  
}
