import java.util.HashSet;


public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<Square> cats = new HashSet<>();
    cats.add(new Square("","John"));
    cats.add(new Square("","Mary"));
    cats.add(new Square("", "Tommy"));

    //!HashSet is from "Hash" family, most of the method form Hash Data Stucture use both equals() & hashCode()
    cats.remove(new Square("", "John"));
    System.out.println(cats.size());//2  //!!! if not override equals()+hashCode(), =3

    System.out.println(cats.contains(new Square("","John"))); //false

    //!Why HashSet
    //!1. Avoide duplicate
    //- use equals() and hashCode()
    boolean result = cats.add(new Square("", "Tommy"));//add another Tommy
    System.out.println(result);//!false, HashSet not allow to add duplicate
    result = cats.add(new Square("", "Steven")); //! HashSet add() -> loop (check if steven already exist)
    System.out.println(result);//true          //! loop-> time consuming  -> if not remove dup, dont use hashSet
    
    
  }
  
}
