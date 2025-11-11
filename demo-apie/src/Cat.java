public class Cat extends Animal {
  
  public static void main(String[] args) {
    //Hierarchy: Object > Animal > Cat
    Cat c1 = new Cat();
    Animal a1 = new Cat();
    Object o1 = new Cat();
    Object o2 = new Animal();


    //! instanceof
    System.out.println(a1 instanceof Cat);//true, is a1 direct to Cat()?
    System.out.println(a1 instanceof Dog);//false

    a1= new Dog();
    System.out.println(a1 instanceof Dog);//true now

    //Cat c2 = (Cat) a1;//!Copile time ok , runtime not ok ->ClassCastException

    if(a1 instanceof Cat){ 
      Cat cw = (Cat) a1;
    }else if (a1 instanceof Dog){
      Dog d2 = (Dog) a1;
      //Animal a1 cannot call Dog's method
      //need Animal->Dog, Dog d2 can call Dog's method
    }
  }
}
