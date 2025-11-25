import java.util.ArrayList;
import java.util.Objects;

public abstract class Animal {
  private String color;

public Animal(String color){
  this.color=color;
}

public String getColor(){
  return this.color;
}

@Override
public String toString(){
  return "Animal( "//
        +"Color= "//
        +this.color//
        +")";
}

@Override
public boolean equals(Object obj){
  if(this==obj)return true;
  if(!(obj instanceof Animal))return false;
  Animal ani = (Animal)obj;
  return Objects.equals(this.color, ani.getColor());
}

@Override
public int hashCode(){
  return Objects.hash(this.color);
}

public abstract String makeSound();
  

public static void main(String[] args) {
  ArrayList<Cat> cats = new ArrayList<Cat>();
  cats.add(new Cat("Brown","Tom"));
  cats.add(new Cat("White", "Dog"));
  cats.add(new Cat("Blue", "Jerry"));

  for(Cat cat : cats){
    System.out.println(cat.getColor());
    System.out.println(cat.getName());
    System.out.println(cat.makeSound());
  }
}
}
