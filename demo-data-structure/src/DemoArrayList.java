
import java.util.ArrayList;
import java.util.List;

public class DemoArrayList{
  public static void main(String[] args) {
    String[] names = new String[2];
    names[0] = "John";
    names[1] = "Peter";

    //Array's disadvantages:
    //1. Fixed Length (Know the required length before using it)
    //2.Same type of values int the array


    //ArrayList has variable length
    ArrayList<String> names2 = new ArrayList<String>();
    names2.add("John");
    names2.add("Peter");
    names2.add("Susan");

    System.out.println(names2); //CONVINENCE [John, Peter, Susan]
    names2.remove("Peter");
    System.out.println(names2);//[John, Susan]

    System.out.println(names2.size());//=array.length
    System.out.println(names2.get(1));//Sussan
    System.out.println(names2.isEmpty());//false
    System.out.println(names2.indexOf("Susan"));//1
    System.out.println(names2.contains("John"));

//Excersice
//create Cat.class
//ArrayList<Cat>
//Animal.java , Cat extends Animal, ArrayList<Animal>
     

     //Create list
     //Method1. Create ArrayList Object
     Cat c1 = new Cat("","John");
     Cat c2 = new Cat("","Mary");
     ArrayList<Cat> cats = new ArrayList<>();
     cats.add(c1);
     cats.add(c2);
     cats.add(new Cat("","Leo"));
     System.out.println(cats);

     //remove->for loop->cat.equals()
     //=need to override cat.equals()
     // if not-> still Object.class equals()->calling object's address
     cats.remove(new Cat("","Leo"));//!Leo still exist if not override, two cats are different
     System.out.println(cats);
     //!remove() -> only remove first matched object
     //!try to put two Leo in the list and remove

     //Method 2. 
     ArrayList<Cat> cats2 = new ArrayList<>(List.of(new Cat("","Oscar"), new Cat("","Jenny")));

     //Combine 2 cat list
     //!addAll can not put singal object
     cats.addAll(cats2);
  }
}