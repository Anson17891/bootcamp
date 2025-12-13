
import java.util.Optional;

public class DemoOptional {
  //! Author can use Optional to present "not found"
                                       //->no need to return null/ other impropr
  //! User use isPresent()/ifPresent() to check if the value exist.
  public static void main(String[] args) {
      Integer[] ages = new Integer[0];
      //Integer[] ages = {1,23,456,7890};
    Optional<Integer> maxAge = findMaxNumber(ages);
    //! Use isPresent() check if the value exists
    //!then .get()

    //!maxAge no longer is null
    if(maxAge.isPresent()){ 
      System.out.println("Max age=" + maxAge.get());
    }else{
      System.out.println("Not found.");
    }
    
    //alt
    if(!maxAge.isPresent()){}

    //!Lambda
    maxAge.ifPresent(age -> {
      System.out.println("max age=" + age);
    });

    //!real life example
    //Find Food, Search Database 
    // -> if found, return Optional.of(Food), else, Optional.empty ("Not found.")

  }

  //!Searching

  //!After using Optional, no need to return null/ other improper
  public static Optional<Integer> findMaxNumber(Integer[] numbers){
    //! what if numbers = null || numbers.length==0?
    if(numbers==null)
      throw new IllegalArgumentException("numbers should not be null.");
    //!but not throw exception? ->Optional<>
   if(numbers.length == 0)
    return Optional.empty();

    int max = numbers[0];
    for(int n:numbers){
      if(n >max)
        max = n;
    }
return Optional.of(max);
  }
}
