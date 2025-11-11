//! extends can only be use for one class, but implements can be used for multiple interfaces
public class Superman extends Human implements Flyable, Eatable{
  
  public Superman(){

  }
  //When explicitly weite down a constructor(aka \/), implies no need a empth constructor
  public Superman(double weight, double height){
  super(weight,height);
  }

//As implemented flyable, must include fly method
@Override
  public void fly(){
    System.out.println("Superman is flying...");
  }
  @Override
  public void eat(){
    System.out.println("Superman is eating...");
  }


  public static void main(String[] args) {
    Eatable[] things = new Eatable[2];
    //! Those classes which implemented Eatble, can be assigned into Eatble[]
    things[0] = new Superman(3.4, 71);
    things[1] = new Student("John");

    for(Eatable e : things){
      e.eat();
    }

    Flyable[] things2 = new Flyable[2];
    things2[0] = new Superman(3, 7);
    //things2[1] = new Student("John"); //error, student has no fly()
  }

}
