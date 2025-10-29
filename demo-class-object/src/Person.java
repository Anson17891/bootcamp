public class Person {
  private Eye[] eyes;  //new class in a class
  private Dog[] dogs;

  public Person(Eye[] eyes, Dog[] dogs){
    this.eyes = eyes;
    this.dogs = dogs;

  }

  public Eye[] getEyes(){
    return this.eyes;
  }

  public Dog[] getDogs(){
    return this.dogs;
  }

  public void setEyes(Eye[] eyes){
    this.eyes = eyes;
  }

  public void setDogs(Dog[] dogs){
    this.dogs = dogs;
  }

  public String isNormal(Eye[] eyes){
    if(eyes.length == 2){
      return "Is normal human";
    }else if(eyes.length >= 2){
      return "Is spider";
    }else if(eyes.length ==1){
      return "Is Cyclopes";
    }return "Is Star-nosed mole";
  }
  
  public String isGay(Dog[] dogs){
    if(dogs.length == 0){
      return "Is gay";
    }return "Is not gay";
  }

  //!try add other new classes you created!


  public static void main(String[] args) {
    Dog daniel = new Dog(3.0, 0.1);
    Dog dean = new Dog(3.3, 1.0);
    Dog[] myDogs = new Dog[]{daniel, dean};

    Eye left = new Eye("Brown");
    Eye right = new Eye("Brown");
    Eye[] myEyes = new Eye[]{left, right};

    Person me = new Person(myEyes, myDogs);



    System.out.println(me.isGay(myDogs));



  }
}
