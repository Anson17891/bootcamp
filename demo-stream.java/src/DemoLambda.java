public class DemoLambda{
  //inout->output(method)

public static void main(String[] args) {
    

  //!Java 8
  //! Lambda Expression (Formula)
  //! no need to build new class -> more simple
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
}
}
