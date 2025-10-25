//! Class-> blueprint, discribe how is the object
//!        -> a file saved in harddisk
public class Cat {
  //! Attribute (parameters to discribe/distinguish this class)
  private String name; 
  private int age;

  //!Constructor
  public Cat(){
    System.out.println("Creating a cat ...");
    
    //default name and age
    this.name = "John";
    this.age = 10;
  }
public static void main(String[] args) {
  //Create a cat object
  //"new" -> create
  //"Cat()" -> calling a constructor
  //"new Cat()" -> create a cat object

  //"c1"-> a label to refer the cat object
  Cat c1 = new Cat();
  System.out.println(c1.name);//John
  System.out.println(c1.age);//10

  //!only "new Cat();" -> only create a cat, but not locate it -> cannot call it
  

  Cat c2 = new Cat();
  c2.name = "Jennie";
  c2.age = 12;
  Cat[] cats = new Cat[]{c1, c2};
  //find the second cat's name
  System.out.println(cats[1].name);//Jennie
  System.out.println(cats[1].age);//12

  //! Without class
  String[] names = new String[]{"John" , "Jennie"}; //= excel column
  int[] ages = new int[]{10 , 12};// = excel column
  //object -> = excel row


//!excersise  write a new class


}

}
