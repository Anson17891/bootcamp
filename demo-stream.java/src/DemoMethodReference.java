
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    //!1. Instance method
    String s = "hello";
    //Lambda
    Supplier<Integer> lengthSupplier = () -> s.length();
    System.out.println(lengthSupplier.get());//5
    //!Method reference
    Supplier<Integer> lengthSupplier2 = s::length;
    System.out.println(lengthSupplier2.get());//5

    //!2. Instance method with parameter   ~BiFunction (Comparator)
    //Lambda
    Comparator<String> compareStringFunction = (s1, s2)->s1.compareToIgnoreCase(s2);
    System.out.println(compareStringFunction.compare("apple","cat"));//-2
    //Method reference
    Comparator<String> compareStringFunction2 = String::compareToIgnoreCase; 
        //Comparetor default has two parameters (aka String) -> :: automatically arrange the two parameters (default s1.compareToIgnoreCase(s2) cannot reverse)
    System.out.println(compareStringFunction2.compare("lion","apple"));//11 


    //!3. Create object (new)
    BiFunction<String, Integer, Cat> creatCatMachine = (name, age) -> new Cat(name, age);
    Cat c1 = creatCatMachine.apply("John", 3);

    BiFunction<String, Integer, Cat> creatCatMachine2 = Cat::new;
    // Cat has two attributes in Constructor, BiFunction also need two parameters, :: auto arrange the parameter
    //BiFunction<Integer, String, Cat> creatCatMachine3 = Cat::new; //error, <Integer, String, Cat>
    Cat c2 = creatCatMachine2.apply("John", 3);

    //!4. Static method
    List<Integer> integers = new ArrayList<>(List.of(10,5,100,-4));
    integers.forEach(e -> System.out.println(e));
    //Method reference
    integers.forEach(System.out::println);
  }
}
