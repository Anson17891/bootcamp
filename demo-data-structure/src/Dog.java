//!See DemoLinkedList
public class Dog {
  private String name;
  private Dog dog;  //a dog can find another dog

  public Dog(String name){
    this.name = name;
  }

  private void setNextDog(Dog dog){
    this.dog= dog;
  }

  //!Excercise remove(int index)

  public void add(Dog dog){  //!simular to linkedList mechanism
    //Find the last one (getDog()->null)
    //then setDog
    Dog currentDog = this;
    while(currentDog!=null){
    if(currentDog.getNextDog()==null){
    currentDog.setNextDog(dog);
     break;
    }
    currentDog =currentDog.getNextDog();
  }
}

  public String getName(){
    return this.name;
  }

  public Dog getNextDog(){
    return this.dog;
  }


  public int size(){ 
   //~loop linkedList
   Dog currentDog = this;
   int count = 0;
    while(currentDog!=null){//!!!!!!! IMPORTANT TECHIQUE
      count++;
      currentDog = currentDog.getNextDog();
    }
    return count ;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("John");
    d1.add(new Dog("Mary"));
    System.out.println(d1.getNextDog().getName());//"Mary"
    System.out.println(d1.getNextDog().getNextDog());//null
    System.out.println(d1.size());//2

    d1.add(new Dog("Tommy"));
    System.out.println(d1.getNextDog().getNextDog().getName());
    System.out.println(d1.size());//3
  }
}
