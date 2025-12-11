
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoLambda{
  //inout->output(method)

public static void main(String[] args) {
    

  //!Java 8
  //! Lambda Expression (Formula)
  //! no need to build new class -> more simple
  //"->" implemnt only required method
  //!"->" only for functional interface(single method's interface)
  //cons : only appliable internally
  //...if the formular is more complicate?
  MathOperation addition = (x, y) -> x + y;
  MathOperation subtraction = (x, y) -> x - y;

  System.out.println(addition.operate(3,10));
  System.out.println(subtraction.operate(3,10));
  

  //if no lambda(befor java8)
  //see AdditionFormula.java
  MathOperation additionFormula = new AdditionFormula();
  System.out.println(additionFormula.operate(3,10));

  //! Built-in Lambda expression
  //1. Function<Input, Output>  ,  .apply(x)
  //apply-method: x*x
  Function<Integer, Integer> squareArea = (x) -> x*x;
  System.out.println(squareArea.apply(3));//9

  Function<String, String> upperFunction = (s)-> s.toUpperCase();
  System.out.println(upperFunction.apply("Hello"));//HELLO

  Function<List<Integer>, Integer> findMaxFunction = (list)->{
    int max = list.get(0);
    for(Integer x : list){
      if(x>max)
        max=x;
    }
    return max;  //!more than one line, use block{}+"return"
  };

  List<Integer> integers = new ArrayList<>(List.of(9,-8,100,4,-55));
  System.out.println(findMaxFunction.apply(integers));//100

  //2.BiFunction<input1, input2, output>
  BiFunction<String, String, Integer> totalLength =(s1,s2)->s1.length()+s2.length();
   System.out.println(totalLength.apply("abc", "bootcamp"));//11


   //3. Consumer<input>   ~void method
  Consumer<List<String>> printOutStrings = strings ->{//!single parameter no need branket
    for(String s:strings){
      System.out.println(s);
      //real life example: send email, put data into database, call API...
    }
  };
  printOutStrings.accept(List.of("John", "Mary", "Leo"));

  //4.Supplier<> no input
  Supplier<Integer> marksixGenerator = ()->new Random().nextInt(49)+1;    //! not input->use()
  System.out.println(marksixGenerator.get());//use get() 1-49
  //if want user input the limit of random
  Function<Integer, Integer> numberGenerator = range-> new Random().nextInt(range)+1;
  System.out.println(numberGenerator.apply(100));//use apply() 1-100

  //5.Predicate<Input> (a kind of Function<>)
  Predicate<Integer> isElderlyFunction = age -> age>65;
  System.out.println(isElderlyFunction.test(70));//use test()  true
  
  Function<Integer, Boolean> isElderlyFunction1 = age->age>65; //!is same
  System.out.println(isElderlyFunction1.apply(70));

  //6.BiPredicate<Input, Input, Output> (a kind of BiFunction)
    //2 inputs, return boolean

  //! What if >=3 parameter? ->no built-in method |||OTZ
  //hand-made -> see superFunction.java
  SuperFunction<String,String,String,String> firstCharFunction = (s1,s2,s3)->{
    return ""+s1.charAt(0) + s2.charAt(0)+s3.charAt(0);//""+  make sum of char become string
  };
  System.out.println(firstCharFunction.apply("abc","ijk","mno"));//"aim"
}
}
