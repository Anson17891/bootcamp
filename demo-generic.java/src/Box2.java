public class Box2{
  private Animal animal; 
  //!not using generic, but want to put different classes
  //use parent class to encapsulate classes,
  //all needed methods put in parents class + override

  public Box2(Animal animal){
    this.animal = animal; 
  }

  public void setAnimal(Animal animal){
    this.animal = animal;
  }

  public void askAnimalToEat(){
    this.animal.eat();
  }

  public static void main(String[] args) {
    Box2 animalBox = new Box2(new Cat());
    animalBox.askAnimalToEat();
    animalBox.setAnimal(new Dog());
    animalBox.askAnimalToEat();

    //Box2 can only store Animal...

  //! Use generic
  Box<Animal> animalBox2 = new Box<>(new Cat());
  Box<String> stringBox = new Box<String>("hello");//!Can also put other class!
  Box<Cat> catBox = new Box<>(new Cat());
  }
}
