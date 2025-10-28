//! Class-> blueprint, discribe how is the object
//!        -> a file saved in harddisk
public class Cat {
  //! Attribute (parameters to discribe/distinguish this class)
  private String name; 
  private int age;

  //!Constructor

  //Empty constructor (No Parameter, suppose no "this.")
  public Cat(){
    System.out.println("Creating a cat ...");//!usually leave empty
    
    //default name and age //!usually leave empty
    this.name = "John";
    this.age = 10;
  }

  //All Argument Constructor
  public Cat(String name, int age){  //!no return type, same name as class =>constructor
    this.name = name; //f(x,y), this.name=x  //! this=this cat you are making
    this.age = age;

  }

  //!Object Method (Instance Method)          private(line 5-6)->public
  public String getName(){
  return this.name;
  }
  public int getAge(){
    return this.age;
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

  //!only "new Cat();" no "Cat c1"-> only create a cat, but not locate it -> cannot call it
  new Cat(); //still print

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

  //Using all argument const.
Cat c3 = new Cat("Mary", 8);

  //using empty const.
Cat c4 = new Cat(); //Default(line 15, 16)-> John 10

//!private(line 5-6)->public
System.out.println(c3.getAge());//8
System.out.println(c4.getAge());//10
//! c3.age also can print out in this case, because it is same page with the CLASS attributes, not availabe when it is in other file 
//! aka c3.age / c4.age are private, no one but author can see

}
}
