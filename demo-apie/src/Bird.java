
import java.util.Objects;

public class Bird {
  private String name;
  private int age;

  public Bird(String name, int age){
    this.name = name;
    this.age = age;
  }  

  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }

  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }

  //!!! THREE MUST Override instance Methods
  @Override
  public String toString(){
    return "Bird(" //
    + "name =" + this.name//
    +" ,age = " + this.age//
    + ")";
  }

  //!Method signature = method name + parameter list(parameters' number/type)
  //@Override //verift if parent has this method-> check method signature   , if no override, is just a new method
  public boolean equals(Object o){ //!Object.equals (input: Object, output: boolean), chlid class must also in:Object, out:boolean
  //if name and age are same, them must be a same bird
    if(this == o){ //if memory object are same, then they're same thing (aka default Object.equals)
    return true;
    }
    if(!(o instanceof Bird)){ //is o not a Bird?  //!see Cat.java
      return false;//o is a Bird
    }
    //now this is a bird, o is also a bird
    // do downcast
    Bird bird = (Bird) o; //Object->Bird ,downcast
    return this.name.equals(bird.getName())//!now, o(->bird) can call Bird's method
    && this.age == bird.getAge(); //Every attributes compare saparately
  }


  //! The definition of equals() and hashCode() must be SAME,(eg.bird, name&age should show in both equals() and hashCode())
  //int -2.1B -> 2.1B
  //"hello" and "hello1" have different hash code
  @Override
  public int hashCode(){  //Java case sensitive, hashcode() w/o @Override means building another method
    return Objects.hash(this.name, this.age);

  }

  public static void main(String[] args) {
    Bird b1 = new Bird("John", 3);
    Bird b2 = new Bird("John", 3);
    System.out.println(b1.equals(b2));//!false if not override (using Object.equals()) ,
    //! Object.equals only check memory object, b1&b2 store at different memory-> false

    System.out.println(b1.hashCode() == b2.hashCode());

    b2.setAge(10);
    System.out.println(b1.equals(b2));//false, age different

    System.out.println(b1.hashCode() == b2.hashCode());
  }
}

