import java.util.Objects;

public class Cat extends Animal{

  private String name;

public Cat(String color, String name){
  super(color);
  this.name = name;
}

public String getName(){
  return this.name;
}

@Override
public String toString(){
  return "Cat("//
        +"Animal( "//
        +"Color= "//
        +super.getColor()//
        +"), "
        +"Name= "
        +this.name
        +")";
}

@Override
public boolean equals(Object obj){
  if(this==obj)return true;
  if(!(obj instanceof Cat))return false;
  Cat cat = (Cat)obj;
  return Objects.equals(super.getColor(), cat.getColor())&&//
         Objects.equals(this.name, cat.getName());
}

@Override
public int hashCode(){
  return Objects.hash(super.getColor(),this.name);
}
@Override
  public String makeSound() {
    return "Meow...";
  }
  
}
