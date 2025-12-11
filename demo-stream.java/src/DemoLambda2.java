

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoLambda2 {
  public static void main(String[] args) {
    //Java 5
    //Generic -> ArrayList<>

    //Java 8
    //Lambda -> 1.Enhance data structure
    //!         2. Stream

    List<Square> squares = List.of(new Square(3.5), new Square(7.0), new Square(2.3));
    //w/o lambda 
    for(Square square : squares){
      System.out.println(square.area());
     }
     //!!!!Lambda
     squares.forEach(s-> System.out.println(s.area())); //!forEach()
  

    //! Map + computeIfAbsent...etc...
    Map<Character, String> fruitMap = new HashMap<>();
    fruitMap.put('a', "apple");
    fruitMap.put('b', "banana");
    
    fruitMap.computeIfAbsent('a',c -> "kiwi");   //if key exist->unchange, if key not exist->create new entry
    System.out.println(fruitMap);//{a=apple,b=banana}

    fruitMap.computeIfAbsent('c',c -> "kiwi");
    System.out.println(fruitMap);//{a=apple,b=banana,c=kiwi}
}
}
