//! Generic 

public class Box3<T extends Animal> {//!Class's T definitiion describe the type of object and its instance method
  private T value;

  public Box3(T value){
  this.value = value;
  }

  public static void main(String[] args) {
  //new Box3<>(new Circle(1));//error-> T extends animal
  //new Box3<>(String);//error
   Box3<Animal> box = new Box3<>(new Cat());
   Box3<Cat> box2 = new Box3<>(new Cat());
   Box3<Dog> box3 = new Box3<>(new Dog());
  }




}
